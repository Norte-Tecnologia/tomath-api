package com.tomath.alternativa

import com.tomath.questao.Questao
import jakarta.persistence.*

@Entity
@Table(name = "question_options")
class Alternativa(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,

    @Column(nullable = false)
    val content: String = "",

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questao_id", nullable = false)
    val questao: Questao = Questao()
)