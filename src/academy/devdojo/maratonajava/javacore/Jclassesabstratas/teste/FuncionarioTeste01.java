package academy.devdojo.maratonajava.javacore.Jclassesabstratas.teste;

import academy.devdojo.maratonajava.javacore.Jclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Jclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Jclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João Lima", 5500);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria Sofia", 3300);
        System.out.println(desenvolvedor);


    }
}
