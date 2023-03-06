package com.tomath.professor

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProfessorRepository : CrudRepository<Professor, Long>
