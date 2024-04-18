package com.atividade1.Repository;

import com.atividade1.Model.Dependente;
import com.atividade1.Model.DependenteKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependenteRepository extends JpaRepository<Dependente, DependenteKey> {
}
