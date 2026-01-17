package academy.devdojo.maratonajava.javacore.Eassociacao.teste;

import academy.devdojo.maratonajava.javacore.Eassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Cristiano Ronaldo");

        Jogador [] jogadores =  {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }



}
