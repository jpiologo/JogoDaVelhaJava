# Jogo da Velha

Este é um simples jogo da velha (Tic-Tac-Toe) desenvolvido em Java. O jogo permite que dois jogadores se alternem na escolha de suas jogadas em um tabuleiro 3x3, podendo escolher entre os símbolos "X" e "O". O projeto é implementado na linha de comando e possui validações para garantir que as entradas sejam corretas.

## Funcionalidades

- Tabuleiro 3x3 para jogar.
- Dois jogadores podem escolher entre "X" e "O".
- Verificação de vitória e empate.
- Validação das entradas para garantir que são números válidos e dentro do intervalo apropriado.
- Opção de reiniciar o jogo após uma partida.

## Estrutura do Projeto

O projeto possui as seguintes classes:

- **JogoDaVelha**: Classe principal que inicia o jogo e contém a lógica do fluxo principal.
- **Matriz**: Classe responsável pela representação do tabuleiro e pela lógica de verificação de vitória e empate.
- **Jogador**: Classe que gerencia a escolha do jogador e a alternância entre eles.

Todas as classes estão organizadas no pacote `GameClasses`.

## Pré-requisitos

Para compilar e executar o projeto, você precisará ter o Java Development Kit (JDK) instalado. Este projeto foi testado com a versão JDK 11.
