package academy.devdojo.maratonajava.javacore.Bintrodocaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 20);
    }

    public void multiplicaDoisNumeros(int num, int num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num, double num2) {
        return num /num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        System.out.println("Dentro do método altera dois numeros: ");
        num1 = 1;
        num2 = 2;
        System.out.println(num1);
        System.out.println(num2);
    }
}
