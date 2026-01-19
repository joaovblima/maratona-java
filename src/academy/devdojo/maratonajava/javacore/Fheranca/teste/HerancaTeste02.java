package academy.devdojo.maratonajava.javacore.Fheranca.teste;

import academy.devdojo.maratonajava.javacore.Fheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Fheranca.dominio.Funcionario;

public class HerancaTeste02 {
    public static void main(String[] args) {

        Endereco endereco2 = new Endereco("Quadra b", "57800000");

        Funcionario funcionario = new Funcionario("Lidiane Cristina", "112313123123", endereco2, 6000.0);

        funcionario.imprime();
    }
}
