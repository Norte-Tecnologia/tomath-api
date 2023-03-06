package com.tomath.aluno

import com.tomath.professor.ProfessorDto


/**
 * A DTO for the {@link com.tomath.aluno.Aluno} entity
 */
data class AlunoDto(
    var nome: String = "",
    var email: String = "",
    var professor: ProfessorDto = ProfessorDto()
)