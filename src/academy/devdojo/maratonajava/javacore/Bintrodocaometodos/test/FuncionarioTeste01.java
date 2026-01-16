package academy.devdojo.maratonajava.javacore.Bintrodocaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintrodocaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "João Lma";
        funcionario.idade = 29;
        double [] arraySalarios = {2000.0, 4000.0, 1234.2};
        funcionario.salarios = arraySalarios;

        funcionario.imprimeDados();
        funcionario.mediaSalarial();

    }
}
