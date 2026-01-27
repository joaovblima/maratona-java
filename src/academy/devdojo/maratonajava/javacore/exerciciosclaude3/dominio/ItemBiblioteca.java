package academy.devdojo.maratonajava.javacore.exerciciosclaude3.dominio;

public abstract class ItemBiblioteca  implements Emprestavel{
    protected String titulo;
    protected String codigo;
    protected StatusLivro status;

    public ItemBiblioteca(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }


    public StatusLivro getStatus() {
        return status;
    }

    public void setStatus(StatusLivro status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ItemBiblioteca{" +
                "titulo='" + titulo + '\'' +
                ", codigo=" + codigo +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean podeEmprestar() {
        return status == StatusLivro.DISPONIVEL;
    }

    @Override
    public void emprestar() {
        if (!podeEmprestar()) {
            throw new IllegalStateException("Item não disponível para emprestimo");
        }
        status = StatusLivro.EMPRESTADO;
    }

    @Override
    public void devolver() {
        status = StatusLivro.DISPONIVEL;
    }
}
