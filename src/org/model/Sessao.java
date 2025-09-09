package org.model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private long id;
    private LocalDateTime inicio;

    private Sala sala;
    private Filme filme;
    private List<Ingresso> ingressos = new ArrayList<>();

    public Sessao() {
    }

    public Sessao(long id, LocalDateTime inicio, Sala sala, Filme filme) {
        this.id = id;
        this.inicio = inicio;
        this.sala = sala;
        this.filme = filme;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void venderIngresso(Ingresso ingresso) {
        if (ingressos.size() < sala.getCapacidade()) {
            ingressos.add(ingresso);
        } else {
            System.out.println("Sala cheia! Não é possível vender mais ingressos.");
        }
    }
}
