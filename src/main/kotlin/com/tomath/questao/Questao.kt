package com.tomath.questao

import jakarta.persistence.*

@Entity
@Table(name = "questoes")
class Questao(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val questaoId: Long = 0L,

    @Column(nullable = false)
    val titulo: String = "",

    @Column(nullable = false, columnDefinition = "TEXT")
    val descricao: String = "",

)