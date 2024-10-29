import GameClasses.Jogador;
import GameClasses.Matriz;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) { //Loop de repetição para Replay do jogo.

            Matriz tabuleiro = new Matriz(); //Classe que constrói a matriz do jogo
            Jogador jogador = new Jogador(); // Classe que determina a escolha de símbolo do jogador

            jogador.escolherSimbolo();
            boolean jogoEmAndamento = true;

            while (jogoEmAndamento) {
                tabuleiro.exibirTabuleiro();
                System.out.println("\nJogador " + jogador.getJogadorAtual() + ", escolha uma linha (0, 1, ou 2) e uma coluna (0, 1, ou 2)");

                int linha = -1;
                int coluna = -1;

                while (linha < 0 || linha > 2) { //Validação de input para linha
                    System.out.print("Linha: ");
                    try {
                        linha = jogador.getScanner().nextInt();
                        if (linha < 0 || linha > 2) {
                            System.out.println("Entrada inválida! A linha deve ser entre 0 e 2.");
                        }
                    } catch (Exception e) {
                        System.out.println("Entrada inválida! Por favor, insira um número.");
                        jogador.getScanner().next();
                    }
                }

                while (coluna < 0 || coluna > 2) { //Validação de input para coluna
                    System.out.print("Coluna: ");
                    try {
                        coluna = jogador.getScanner().nextInt();
                        if (coluna < 0 || coluna > 2) {
                            System.out.println("Entrada inválida! A coluna deve ser entre 0 e 2.");
                        }
                    } catch (Exception e) {
                        System.out.println("Entrada inválida! Por favor, insira um número.");
                        jogador.getScanner().next();
                    }
                }

                if (tabuleiro.fazerJogada(linha, coluna, jogador.getJogadorAtual())) { //Verifica vencedor a cada jogada.
                    if (tabuleiro.verificaVencedor(jogador.getJogadorAtual())) {
                        tabuleiro.exibirTabuleiro();
                        System.out.println("O jogador " + jogador.getJogadorAtual() + " é o vencedor!");
                        jogoEmAndamento = false;
                    } else if (tabuleiro.verificaEmpate()) { //Verifica empate a cada jogada.
                        tabuleiro.exibirTabuleiro();
                        System.out.println("Deu velha!");
                        jogoEmAndamento = false;
                    } else { //Pula para o próximo jogador.
                        jogador.alternarJogador();
                    }
                }
            }

            System.out.println("Deseja jogar novamente? (s/n): ");
            char resposta = scanner.next().toLowerCase().charAt(0);
            jogarNovamente = (resposta == 's'); //Jogar novamente é verdadeiro.
        }

        System.out.println("Obrigado por jogar! :D");

    }
}
