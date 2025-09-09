package org.model;

public class Funcionario {
    private long id;
    private String nome;
    private String cpf;
    private String matricula;

    public Funcionario() {
    }

    public Funcionario(long id, String nome, String cpf, String matricula) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void venderIngresso(Cliente cliente, Sessao sessao, Ingresso ingresso) {
        cliente.comprarIngresso(ingresso, sessao);
        System.out.println("Funcionário " + nome + " vendeu ingresso para " + cliente.getNome());
    }
}
