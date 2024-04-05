package com.aulas.repository;

import com.atividade1.Model.Funcionario;
import com.aulas.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
