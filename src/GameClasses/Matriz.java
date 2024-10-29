package GameClasses;

public class Matriz {

    private char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public void exibirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
    }

    public boolean fazerJogada(int linha, int coluna, char jogadorAtual) {
        if (tabuleiro[linha][coluna] == ' ') {
            tabuleiro[linha][coluna] = jogadorAtual;
            return true;
        } else {
            System.out.println("Posição Ocupada! Tente em outra posição.");
            return false;
        }
    }



}
