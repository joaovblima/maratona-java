package academy.devdojo.maratonajava.javacore.Bintrodocaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodocaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 10;
        int num2 = 20;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro da classe CalculadoraTeste03");
        System.out.println(num1);
        System.out.println(num2);

    }
}
