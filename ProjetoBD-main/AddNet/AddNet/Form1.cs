using System.Data;

namespace AddNet
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Banco db = new Banco();
            DataTable dt = new DataTable();

            dt = db.executaConsulta("select * from pessoa");
            dataGridView1.DataSource = dt;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Pessoa p = new Pessoa();
            p.nome = textBox2.Text;
            p.idade = int.Parse(textBox3.Text);

            if (p.gravar())
            {
                MessageBox.Show("Gravado com sucesso!");
                button1_Click(null, null);
            }
            else
            {
                MessageBox.Show("Erro ao gravar!");
            }
        }

        private void Deletar_Click(object sender, EventArgs e)
        {
            Pessoa p = new Pessoa();

            p.id = int.Parse(txtDeletar.Text);

            if (p.deletar())
            {
                MessageBox.Show("Excluido com sucesso!");
            }
            else
            {
                MessageBox.Show("Erro ao Excluir!");
            }
        }
    }
}