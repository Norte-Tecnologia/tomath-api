package com.tomath.dificuldade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dificuldade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dificuldadeId;
    private Integer dificuldadeIndice;
    private String descricaoDificuldade;

    public Long getDificuldadeId() {
        return dificuldadeId;
    }

    public void setDificuldadeId(Long dificuldadeId) {
        this.dificuldadeId = dificuldadeId;
    }

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
