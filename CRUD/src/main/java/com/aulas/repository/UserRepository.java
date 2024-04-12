package com.aulas.repository;

import com.atividade1.Model.Funcionario;
import com.aulas.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    List<User> findByNameContainingIgnoreCase(String name);

}
