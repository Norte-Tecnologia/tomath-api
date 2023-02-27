package com.tomath.assunto;

import com.tomath.materia.Materia;

import javax.persistence.*;

@Entity
public class Assunto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assuntoId;

    @Column(nullable = false)
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materia;

    public Long getAssuntoId() {
        return assuntoId;
    }

    public void setAssuntoId(Long assuntoId) {
        this.assuntoId = assuntoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
