package academy.devdojo.maratonajava.javacore.exerciciosclaude3.dominio;

public class Livro extends ItemBiblioteca{
    private CategoriaLivro categoria;


    public Livro(String titulo, String codigo, CategoriaLivro categoria) {
        super(titulo, codigo);
        this.categoria = categoria;
    }
}


