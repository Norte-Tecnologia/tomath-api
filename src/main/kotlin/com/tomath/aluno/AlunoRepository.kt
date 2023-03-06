package com.tomath.aluno

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AlunoRepository : CrudRepository<Aluno, Long>