package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAnual = 34711;
        double primeiraFaixa = 9.7/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.5/100;
        double valorDesconto;
        if (salarioAnual <= 34712) {
            valorDesconto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual>= 34713 && salarioAnual <= 68507) {

            valorDesconto = salarioAnual * segundaFaixa;
        } else {

            valorDesconto = salarioAnual * terceiraFaixa;
        }
        System.out.printf("valor a pagar de taxa = R$ %.2f",  valorDesconto);
    }
}
