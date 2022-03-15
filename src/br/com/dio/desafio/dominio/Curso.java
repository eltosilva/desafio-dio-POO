package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria){
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public double calcularXP() {
        return Conteudo.XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return titulo.equals(curso.titulo) &&
                descricao.equals(curso.descricao) && cargaHoraria == cargaHoraria;
    }
}
