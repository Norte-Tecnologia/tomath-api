package com.tomath.materia

import org.hibernate.Hibernate
import javax.persistence.*

@Entity
data class Materia (

    @Column(nullable = false)
    val nome: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val materiaId: Long? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Materia

        return materiaId != null && materiaId == other.materiaId
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(materiaId = $materiaId , nome = $nome )"
    }
}