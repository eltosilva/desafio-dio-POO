package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data){
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return Conteudo.XP_PADRAO + 20;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Mentoria)) return false;

        Mentoria mentoria = (Mentoria) obj;
        return titulo.equals(mentoria.titulo) &&
                descricao.equals(mentoria.descricao) &&
                data.equals(mentoria.data);
    }
}
