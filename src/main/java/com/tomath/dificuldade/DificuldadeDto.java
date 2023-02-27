package com.tomath.dificuldade;

import java.io.Serializable;

/**
 * A DTO for the {@link Dificuldade} entity
 */
public class DificuldadeDto implements Serializable {
    private Integer dificuldadeIndice;
    private String descricaoDificuldade;

    public Integer getDificuldadeIndice() {
        return dificuldadeIndice;
    }

    public void setDificuldadeIndice(Integer dificuldadeIndice) {
        this.dificuldadeIndice = dificuldadeIndice;
    }

    public String getDescricaoDificuldade() {
        return descricaoDificuldade;
    }

    public void setDescricaoDificuldade(String descricaoDificuldade) {
        this.descricaoDificuldade = descricaoDificuldade;
    }
}