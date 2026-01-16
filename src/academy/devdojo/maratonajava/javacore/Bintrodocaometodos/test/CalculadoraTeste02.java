package academy.devdojo.maratonajava.javacore.Bintrodocaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodocaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
    }
}
