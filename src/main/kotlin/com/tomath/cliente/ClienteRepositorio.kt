package com.tomath.cliente

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClienteRepositorio : JpaRepository<Cliente?, Long?>