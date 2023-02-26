package com.tomath.questao

import jakarta.persistence.*

@Entity
class Questao(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val questaoId: Long = 0L,
    val materia: String = ""
)