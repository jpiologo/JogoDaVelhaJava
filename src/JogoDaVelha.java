import GameClasses.Jogador;
import GameClasses.Matriz;

public class JogoDaVelha {
    public static void main(String[] args) {
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
                jogador.alternarJogador();
            }
        }

    }
}
