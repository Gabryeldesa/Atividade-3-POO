package org.model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private long id;
    private String nome;
    private String endereco;

    private List<Sala> salas = new ArrayList<>();
    private List<Filme> filmes = new ArrayList<>();

    public Cinema() {
    }

    public Cinema(long id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void adicionarSala(Sala sala) {
        this.salas.add(sala);
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
    }
}
