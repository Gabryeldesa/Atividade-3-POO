package org.model;
public class Ingresso {
    private long id;
    private String meia;
    private String inteira;

    private Cliente cliente;
    private Sessao sessao;

    public Ingresso() {
    }

    public Ingresso(long id, String meia, String inteira, Cliente cliente, Sessao sessao) {
        this.id = id;
        this.meia = meia;
        this.inteira = inteira;
        this.cliente = cliente;
        this.sessao = sessao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMeia() {
        return meia;
    }

    public void setMeia(String meia) {
        this.meia = meia;
    }

    public String getInteira() {
        return inteira;
    }

    public void setInteira(String inteira) {
        this.inteira = inteira;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
}

