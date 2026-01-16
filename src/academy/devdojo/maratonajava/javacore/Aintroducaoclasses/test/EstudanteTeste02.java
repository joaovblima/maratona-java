package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Sofia";
        estudante.idade = 8;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
    }
}
