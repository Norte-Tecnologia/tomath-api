package com.tomath.assunto;

import com.tomath.materia.MateriaDto;

import java.io.Serializable;

/**
 * A DTO for the {@link Assunto} entity
 */
public class AssuntoDto implements Serializable {
    private String nome;
    private MateriaDto materia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MateriaDto getMateria() {
        return materia;
    }

    public void setMateria(MateriaDto materia) {
        this.materia = materia;
    }
}