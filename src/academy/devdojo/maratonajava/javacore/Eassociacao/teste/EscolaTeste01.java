package academy.devdojo.maratonajava.javacore.Eassociacao.teste;

import academy.devdojo.maratonajava.javacore.Eassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Eassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Escola escola1 = new Escola("Educandario Olimpia");
        Professor professor1 = new Professor("Snape");
        Professor [] professores = {professor1};
        escola1.setProfessores(professores);

        escola1.imprime();

    }
}
