package com.tomath.repository;

import com.tomath.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Clientes extends JpaRepository<Cliente, Long> {

}
