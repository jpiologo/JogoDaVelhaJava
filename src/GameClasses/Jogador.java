package GameClasses;
import java.util.Scanner;

public class Jogador {
    private char jogadorAtual;
    private char jogadorEscolhido;
    Scanner scanner = new Scanner(System.in);

    public void escolherSimbolo() {
        boolean simboloValido = false;

        while (!simboloValido) {
            System.out.println("Escolha seu símbolo (X ou O): ");
            jogadorEscolhido = scanner.next().toUpperCase().charAt(0);

            if (jogadorEscolhido == 'X' || jogadorEscolhido == 'O') {
                jogadorAtual = jogadorEscolhido;
                simboloValido = true;
            } else {
                System.out.println("Símbolo inválido! Escolha 'X' ou 'O'.");
            }
        }
    }

    public void alternarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    public char getJogadorAtual() {
        return jogadorAtual;
    }

    public Scanner getScanner() {
        return scanner;
    }

}


