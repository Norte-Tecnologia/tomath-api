package com.tomath.aluno

import com.tomath.professor.Professor
import org.hibernate.Hibernate
import javax.persistence.*
@Entity
data class Aluno(
    @Column(nullable = false)
    val nome: String,

    @Column(nullable = false)
    val email: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    val professor: Professor
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val alunoId: Long? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Aluno

        return alunoId != null && alunoId == other.alunoId
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(alunoId = $alunoId , nome = $nome , email = $email )"
    }
}