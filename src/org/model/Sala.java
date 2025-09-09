package org.model;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private long id;
    private String nome;
    private int capacidade;

    private List<Sessao> sessoes = new ArrayList<>();

    public Sala() {
    }

    public Sala(long id, String nome, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void adicionarSessao(Sessao sessao) {
        this.sessoes.add(sessao);
    }
}
