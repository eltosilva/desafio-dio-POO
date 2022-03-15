package br.com.dio.desafio.dominio;

import java.util.Objects;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10;

    protected String titulo;
    protected String descricao;

    public Conteudo(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao);
    }
}
