package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;
    private Set<Dev> devsInscritos;
    private Set<Conteudo> conteudos;

    public Bootcamp(String nome, String descricao, Collection<Conteudo> conteudos){
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(45);
        this.devsInscritos = new HashSet<>();

        this.nome = nome;
        this.descricao = descricao;
        this.conteudos = new LinkedHashSet<>(conteudos);
    }

    public void matricularDev(Dev dev){
        this.devsInscritos.add(dev);
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return new HashSet<>(this.devsInscritos);
    }

    public Set<Conteudo> getConteudos() {
        return new LinkedHashSet<>(this.conteudos);
    }
}
