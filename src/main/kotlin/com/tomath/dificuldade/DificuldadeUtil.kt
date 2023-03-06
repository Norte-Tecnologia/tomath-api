package com.tomath.dificuldade

fun Dificuldade.toDificuldadeDto() = DificuldadeDto(
    dificuldadeIndice, descricaoDificuldade
)

fun DificuldadeDto.toDificuldade() = Dificuldade(
    dificuldadeIndice, descricaoDificuldade
)