package com.tomath.assunto

import com.tomath.materia.Materia
import org.hibernate.Hibernate
import javax.persistence.*

@Entity
data class Assunto(

    @Column(nullable = false)
    val nome: String,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.PERSIST])
    @JoinColumn(name = "materia_id", nullable = false)
    val materia: Materia
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val assuntoId: Long? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Assunto

        return assuntoId != null && assuntoId == other.assuntoId
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(assuntoId = $assuntoId , nome = $nome )"
    }
}