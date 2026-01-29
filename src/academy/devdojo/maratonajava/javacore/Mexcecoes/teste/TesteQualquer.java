package academy.devdojo.maratonajava.javacore.Mexcecoes.teste;

public class TesteQualquer {
    public static void main(String[] args) {
        System.out.println("que loucura, nao tem como desistir de você meu javinha, vou manter minha promessa. ");
        System.out.println("tenho que persistir até conseguir. vamos la. estamos mais da metade, nao podemos parar agora. ");
        retornaAlgo();
        System.out.println(somaNumeros(2, 4));
        saudacao("joao");
        testandoFuncoesStaticasFinalmente();
    }

    public static void retornaAlgo() {
        System.out.println("retorna algo");
    }

    public static int somaNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void saudacao(String nome) {
        System.out.println("Ola " + nome + " tu é doido de pedra");
    }

    public static void testandoFuncoesStaticasFinalmente() {
        retornaAlgo();
        int resultado = somaNumeros(10, 30);
        System.out.println(resultado);
        saudacao("joao victor bernardino de lima");
    }
}
