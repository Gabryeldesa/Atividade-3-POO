package org.model;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private long id;
    private String titulo;
    private int duracaoEmMinutos;
    private String classificacaoIndicativa;

    private final List<Sessao> sessoes = new ArrayList<>();

    public Filme() {
    }

    public Filme(long id, String titulo, int duracaoEmMinutos, String classificacaoIndicativa) {
        this.id = id;
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void adicionarSessao(Sessao sessao) {
        this.sessoes.add(sessao);
    }
}
