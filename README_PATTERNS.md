# Aplicação de Padrões Criacionais no Módulo de Operações

**Factory Method + Builder (Swing/DAO – ERP Materiais Recicláveis)**  
Autor: Matheus Uliana Rossato — Data: 18/09/2025

## Padrões e justificativa

• Factory Method: encapsula a criação de objetos que variam por TIPO (Entrada, Saída, Ajuste),
  evitando if-else espalhados e centralizando as regras específicas em fábricas concretas.
• Builder: padroniza a montagem de objetos complexos (Operacao), validando obrigatórios e
  aplicando valores padrão (ex.: data_hora), reduzindo risco de “objeto pela metade” ao salvar.


## Onde aparecem

1) Builder — em Beans/Operacao.java (classe interna Operacao.Builder)
   - Valida produto, usuario, tipo_operacao e quantidade (obrigatórios).
   - Define data_hora automaticamente quando não informada.

2) Factory Method — pacote factory/
   - OperacaoFactory (classe base) + EntradaFactory, SaidaFactory, AjusteFactory.
   - Cada fábrica concreta aplica suas regras (ex.: quantidade positiva na Entrada/Saída).
   - As fábricas usam o Builder por baixo para montar a Operacao.


## Arquivos alterados/criados

Arquivos ALTERADOS:
• Beans/Operacao.java  (adição do Builder)
• DAO/OperacaoDao.java (correção de parâmetros em Editar; remoção de rs.first() em listas)

Arquivos NOVOS:
• factory/OperacaoFactory.java
• factory/EntradaFactory.java
• factory/SaidaFactory.java
• factory/AjusteFactory.java


## Antes/Depois (ponto crítico na UI)
```java
// Antes (InterfaceOperacao.java): construção manual e dispersa
Operacao o = new Operacao();
o.setId_produto(p);
o.setId_usuario(u);
o.setTipo_operacao(comboOperacao.getSelectedItem().toString());
o.setMotivo(comboMotivo.getSelectedItem().toString());
o.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
o.setData_hora(Jdate.getDate());
new OperacaoDao().inserir(o);

```
```java
// Depois (Factory Method usando Builder por baixo)
OperacaoFactory factory;
String tipo = comboOperacao.getSelectedItem().toString(); // "Entrada" | "Saída" | "Ajuste"
switch (tipo) {
    case "Entrada" -> factory = new EntradaFactory();
    case "Saída"   -> factory = new SaidaFactory();
    default        -> factory = new AjusteFactory();
}
Operacao o = factory.criar(p, u, comboMotivo.getSelectedItem().toString(),
                           Integer.parseInt(txtQuantidade.getText()), Jdate.getDate());
new OperacaoDao().inserir(o);

```

## Núcleo do Builder e Factory
```java
// Trecho central do Builder (Beans/Operacao.java)
public static class Builder {
    private Produto produto; private Usuario usuario; private String tipo;
    private String motivo; private Integer quantidade; private Date dataHora;
    public Builder produto(Produto p){ this.produto=p; return this; }
    public Builder usuario(Usuario u){ this.usuario=u; return this; }
    public Builder tipo(String t){ this.tipo=t; return this; }
    public Builder motivo(String m){ this.motivo=m; return this; }
    public Builder quantidade(int q){ this.quantidade=q; return this; }
    public Builder dataHora(Date d){ this.dataHora=d; return this; }
    public Operacao build(){
        Objects.requireNonNull(produto); Objects.requireNonNull(usuario);
        Objects.requireNonNull(tipo); Objects.requireNonNull(quantidade);
        Operacao op = new Operacao();
        op.setId_produto(produto); op.setId_usuario(usuario);
        op.setTipo_operacao(tipo); op.setMotivo(motivo);
        op.setQuantidade(quantidade);
        op.setData_hora(dataHora != null ? dataHora : new Date());
        return op;
    }
}

```
```java
// Trecho central do Factory (factory/OperacaoFactory.java)
public abstract class OperacaoFactory {
    public abstract Operacao criar(Produto p, Usuario u, String motivo, int qtd, Date quando);
    protected Operacao base(Produto p, Usuario u, String tipo, String motivo, int qtd, Date quando){
        return new Operacao.Builder()
            .produto(p).usuario(u).tipo(tipo).motivo(motivo)
            .quantidade(qtd).dataHora(quando != null ? quando : new Date())
            .build();
    }
}

```

## Raciocínio e conclusão

Raciocínio de projeto:
1) A tela precisava criar Operacao com variações por tipo. Em vez de if-else na UI, movemos essa
   decisão para fábricas concretas (Factory Method). Assim, regras por tipo ficam centralizadas.
2) Para garantir que toda Operacao criada esteja consistente (sem campos faltantes), a fábrica
   usa o Builder, que valida e aplica defaults. A UI fica limpa e a montagem padronizada.
3) Evolução: novos tipos (ex.: Transferência) entram criando nova fábrica concreta, sem tocar na UI.


**Conclusão.** 
Resultado: criação coesa e extensível, menos duplicação e menos risco de inconsistência.
Os dois padrões cumprem os requisitos da atividade (dois criacionais) e melhoram a manutenção.

