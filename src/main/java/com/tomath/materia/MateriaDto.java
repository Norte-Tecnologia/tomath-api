package com.tomath.materia;

import java.io.Serializable;

/**
 * A DTO for the {@link Materia} entity
 */
public class MateriaDto implements Serializable {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}