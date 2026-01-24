package academy.devdojo.maratonajava.javacore.Lpolimorfismo.servico;


import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto: ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Preço: R$ "+ produto.getValor());
        System.out.println("Imposto: R$"+ imposto);

    }
}
