package academy.devdojo.maratonajava.javacore.Eassociacao.teste;

import academy.devdojo.maratonajava.javacore.Eassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Eassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Eassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Eassociacao.dominio.Seminario;

public class AssociacaoTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Beco diagonal");
        Seminario seminario = new Seminario("Defesa contra artes das trevas", local);
        Aluno aluno1 = new Aluno("Harry", 21);
        Aluno aluno2 = new Aluno("Hermione", 20);
        Professor professor1 = new Professor("Snape", "Legilemente");
        Seminario [] seminarios = {seminario};
        Aluno[] alunos = {aluno1, aluno2};

        professor1.setSeminarios(seminarios);
        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setAlunos(alunos);

        seminario.imprime();
        System.out.println("--------");
        aluno1.imprime();
        System.out.println("---------");
        aluno2.imprime();
        System.out.println("---------");
        professor1.imprime();

    }
}
