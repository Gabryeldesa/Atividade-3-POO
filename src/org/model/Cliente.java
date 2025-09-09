package org.model;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private long id;
    private String nome;
    private String cpf;
    private int idade;

    private List<Ingresso> ingressos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(long id, String nome, String cpf, int idade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void comprarIngresso(Ingresso ingresso, Sessao sessao) {
        sessao.venderIngresso(ingresso);
        this.ingressos.add(ingresso);
    }
}
