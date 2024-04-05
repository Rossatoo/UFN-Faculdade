package com.atividade1.Repository;

import com.atividade1.Model.TrabalhaEm;
import com.atividade1.Model.TrabalhaEmKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrabalhaEmRepository extends JpaRepository<TrabalhaEm, TrabalhaEmKey> {
}
