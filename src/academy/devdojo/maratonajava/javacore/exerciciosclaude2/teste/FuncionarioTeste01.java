package academy.devdojo.maratonajava.javacore.exerciciosclaude2.teste;

import academy.devdojo.maratonajava.javacore.exerciciosclaude2.dominio.Cargo;
import academy.devdojo.maratonajava.javacore.exerciciosclaude2.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.exerciciosclaude2.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("João Lima", Cargo.JUNIOR, 5000);
        System.out.println("salario com bonus: R$ "+dev.calcularSalarioTotal());

        Gerente gerente = new Gerente("Ingird Melo", Cargo.GERENTE, 10000);
        System.out.println("Salario do gerente com bonus: R$ "+gerente.calcularSalarioTotal());
    }
}
