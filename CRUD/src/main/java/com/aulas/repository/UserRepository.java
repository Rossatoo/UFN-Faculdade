package com.aulas.repository;

import com.atividade1.Model.Funcionario;
import com.aulas.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    List<User> findByNameContainingIgnoreCase(String name);

    @Query(value = "SELECT * FROM user WHERE name LIKE CONCAT('%', ?1, '%')", nativeQuery = true)
    User findByAlgumaCoisaName(String name);

}
