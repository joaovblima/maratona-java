package academy.devdojo.maratonajava.javacore.Bintrodocaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodocaometodos.dominio.Funcionario;

public class FuncionarioTeste02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario.nome = "Ingrid Melo";
        funcionario.idade = 26;
        funcionario.salarios = new double[] {2000.0, 4000.0, 3500.0};

        funcionario.imprimeDados();
        funcionario.mediaSalarial();

        funcionario2.nome = "João Lima";
        funcionario2.idade = 29;
        System.out.println("------------------");
        funcionario2.imprimeDados();
        funcionario2.mediaSalarial();
    }
}
