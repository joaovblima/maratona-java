package academy.devdojo.maratonajava.javacore.exerciciosclaude2.teste;

import academy.devdojo.maratonajava.javacore.exerciciosclaude2.dominio.Cargo;
import academy.devdojo.maratonajava.javacore.exerciciosclaude2.dominio.Desenvolvedor;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("João Lima", Cargo.JUNIOR, 5000);
        System.out.println("salario com bonus: R$ "+dev.calcularSalarioTotal());
    }
}
