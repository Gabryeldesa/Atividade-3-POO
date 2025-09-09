import org.model.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Criando cinema
        Cinema cinema = new Cinema(1, "CineTop", "Rua Central, 123");

        // Criando sala
        Sala sala1 = new Sala(1, "Sala 1", 3);
        cinema.adicionarSala(sala1);

        // Criando filme
        Filme filme1 = new Filme(1, "O Senhor dos Anéis", 180, "12 anos");
        cinema.adicionarFilme(filme1);

        // Criando sessão
        Sessao sessao1 = new Sessao(1, LocalDateTime.of(2025, 9, 10, 20, 0), sala1, filme1);
        sala1.adicionarSessao(sessao1);
        filme1.adicionarSessao(sessao1);

        // Criando cliente
        Cliente cliente1 = new Cliente(1, "João da Silva", "123.456.789-00", 25);

        // Criando funcionário
        Funcionario funcionario1 = new Funcionario(1, "Maria Souza", "987.654.321-00", "F001");

        // Criando ingressos
        Ingresso ingresso1 = new Ingresso(1, "Sim", "Não", cliente1, sessao1);
        Ingresso ingresso2 = new Ingresso(2, "Não", "Sim", cliente1, sessao1);
        Ingresso ingresso3 = new Ingresso(3, "Sim", "Não", cliente1, sessao1);

        // Funcionário vende ingressos
        funcionario1.venderIngresso(cliente1, sessao1, ingresso1);
        funcionario1.venderIngresso(cliente1, sessao1, ingresso2);
        funcionario1.venderIngresso(cliente1, sessao1, ingresso3);

        // Tentativa de ultrapassar a capacidade
        Ingresso ingresso4 = new Ingresso(4, "Não", "Sim", cliente1, sessao1);
        funcionario1.venderIngresso(cliente1, sessao1, ingresso4);

        // Exibindo dados
        System.out.println("\nResumo:");
        System.out.println("Cinema: " + cinema.getNome());
        System.out.println("Sala: " + sala1.getNome());
        System.out.println("Filme: " + filme1.getTitulo());
        System.out.println("Sessão: " + sessao1.getInicio());
        System.out.println("Ingressos vendidos: " + sessao1.getIngressos().size());
    }
}

