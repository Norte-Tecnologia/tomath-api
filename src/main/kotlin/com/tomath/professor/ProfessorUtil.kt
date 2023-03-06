package com.tomath.professor


fun Professor.toProfessorDto() = ProfessorDto(
    nome,
    email,
)

fun ProfessorDto.toProfessor() = Professor(
    nome,
    email
)
