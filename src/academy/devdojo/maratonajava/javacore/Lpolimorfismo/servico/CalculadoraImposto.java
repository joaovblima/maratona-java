package academy.devdojo.maratonajava.javacore.Lpolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Lpolimorfismo.dominio.Computador;

public class CalculadoraImposto {
    public static void calcularImpostoComputador (Computador computador) {
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: "+ computador.getNome());
        System.out.println("Valor: R$"+computador.getValor());
        System.out.println("Imposto a ser pago R$"+imposto);
    }
}
