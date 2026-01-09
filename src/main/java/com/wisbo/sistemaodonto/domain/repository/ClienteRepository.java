package com.wisbo.sistemaodonto.domain.repository;

import com.wisbo.sistemaodonto.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}