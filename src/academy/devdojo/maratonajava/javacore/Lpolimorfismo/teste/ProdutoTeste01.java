package academy.devdojo.maratonajava.javacore.Lpolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {

        Computador computador = new Computador("DELL XPS", 13000);

        CalculadoraImposto.calcularImpostoComputador(computador);

    }
}
