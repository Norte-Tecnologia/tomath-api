package com.tomath.aluno

import com.tomath.professor.toProfessor
import com.tomath.professor.toProfessorDto

fun Aluno.toAlunoDto() = AlunoDto(
    nome,
    email,
    professor = professor.toProfessorDto()
)

fun AlunoDto.toAluno() = Aluno(
    nome,
    email,
    professor = professor.toProfessor()
)
