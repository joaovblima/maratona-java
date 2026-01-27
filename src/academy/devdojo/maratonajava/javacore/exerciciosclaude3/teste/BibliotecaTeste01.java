package academy.devdojo.maratonajava.javacore.exerciciosclaude3.teste;

import academy.devdojo.maratonajava.javacore.exerciciosclaude3.dominio.*;

public class BibliotecaTeste01 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("História de uma alma", "001", CategoriaLivro.BIOGRAFIA);
        biblioteca.adicionarItem(livro1);

        Usuario joao = new Usuario("João", 2);

        Emprestimo e1 = biblioteca.emprestarItem("001", joao);

        biblioteca.devolverItem(e1, joao);

    }
}
