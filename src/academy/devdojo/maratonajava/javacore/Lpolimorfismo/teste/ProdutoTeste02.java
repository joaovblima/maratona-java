package academy.devdojo.maratonajava.javacore.Lpolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Produto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Positivo", 4000);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
    }
}
