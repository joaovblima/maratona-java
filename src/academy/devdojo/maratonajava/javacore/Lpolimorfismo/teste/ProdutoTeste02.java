package academy.devdojo.maratonajava.javacore.Lpolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Positivo", 4000);
        Televisao tv = new Televisao("Samsung 4k ULTRA WIDE GPT 4.0 60\"", 10000);


        CalculadoraImposto.calcularImposto(produto);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
