package com.tomath.professor

import com.tomath.aluno.Aluno
import org.hibernate.Hibernate
import javax.persistence.*

@Entity
data class Professor(
    @Column(nullable = false)
    val nome: String,

    @Column(nullable = false)
    val email: String,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val professorId: Long? = null

    @OneToMany(mappedBy = "professor", cascade = [CascadeType.ALL])
    val alunos: List<Aluno>? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Professor

        return professorId != null && professorId == other.professorId
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(professorId = $professorId , nome = $nome , email = $email )"
    }

}