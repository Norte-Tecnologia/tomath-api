package com.tomath.questao;

import com.tomath.materia.MateriaDto;

import java.io.Serializable;

/**
 * A DTO for the {@link Questao} entity
 */
public class QuestaoDto implements Serializable {
    private String enunciado;
    private String linkDeApoio;
    private MateriaDto materia;
    private String assunto;
    private String respostaCorreta;

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getLinkDeApoio() {
        return linkDeApoio;
    }

    public void setLinkDeApoio(String linkDeApoio) {
        this.linkDeApoio = linkDeApoio;
    }

    public MateriaDto getMateria() {
        return materia;
    }

    public void setMateria(MateriaDto materia) {
        this.materia = materia;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }
}