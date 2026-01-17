package academy.devdojo.maratonajava.javacore.Eassociacao.teste;

import academy.devdojo.maratonajava.javacore.Eassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Eassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time1 = new Time("Selecao Brasileira");
        jogador1.setTime(time1);

        jogador1.imprime();
    }
}
