package academy.devdojo.maratonajava.javacore.Fheranca.teste;

import academy.devdojo.maratonajava.javacore.Fheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Fheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("José Hortêncio de Souza", "5780000");
        Pessoa pessoa1 = new Pessoa("João Lima", "10779136489", endereco);

        pessoa1.imprime();
    }
}
