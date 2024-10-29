package GameClasses;

public class Matriz {

    private char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public void exibirTabuleiro() { //Exibe o tabuleiro de forma gráfica.
        System.out.println("\n");
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

    public boolean verificaVencedor(char jogador) {
        //Verifica linhas, colunas e diagonais.

        for (int i = 0; i < 3; i++) {
            //Verificando Linhas:
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
            //Verificando Colunas:
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        //Verificando diagonais.
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }

    public boolean verificaEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

}
