package academy.devdojo.maratonajava.introducao;

public class Aula06Exercicio {
    public static void main(String[] args) {
        double salarioAnual = 34711;
        double taxa = 9.7;
        double valorDesconto;
        if (salarioAnual <= 34712) {
            valorDesconto = salarioAnual * (taxa / 100);
        } else if (salarioAnual <= 68507) {
            taxa = 37.35/100;
            valorDesconto = salarioAnual * taxa;
        } else {
            taxa = 49.5/100;
            valorDesconto = salarioAnual * taxa;
        }
        System.out.printf("valor a pagar de taxa = R$ %.2f",  valorDesconto);
    }
}
