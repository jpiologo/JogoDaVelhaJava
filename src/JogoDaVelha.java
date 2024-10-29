import GameClasses.Jogador;
import GameClasses.Matriz;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {

            Matriz tabuleiro = new Matriz();
            Jogador jogador = new Jogador();

            jogador.escolherSimbolo();
            boolean jogoEmAndamento = true;

            while (jogoEmAndamento) {
                tabuleiro.exibirTabuleiro();
                System.out.println("Jogador " + jogador.getJogadorAtual() + ", escolha uma linha (0, 1, ou 2) e uma coluna (0, 1, ou 2):");

                int linha = jogador.getScanner().nextInt();
                int coluna = jogador.getScanner().nextInt();

                if (tabuleiro.fazerJogada(linha, coluna, jogador.getJogadorAtual())) {
                    if (tabuleiro.verificaVencedor(jogador.getJogadorAtual())) {
                        tabuleiro.exibirTabuleiro();
                        System.out.println("O jogador " + jogador.getJogadorAtual() + " é o vencedor!");
                        jogoEmAndamento = false;
                    } else if (tabuleiro.verificaEmpate()) {
                        tabuleiro.exibirTabuleiro();
                        System.out.println("Deu velha!");
                        jogoEmAndamento = false;
                    } else {
                        jogador.alternarJogador();
                    }
                }
            }

            System.out.println("Deseja jogar novamente? (s/n): ");
            char resposta = scanner.next().toLowerCase().charAt(0);
            jogarNovamente = (resposta == 's');
        }

        System.out.println("Obrigado por jogar!");

    }
}
