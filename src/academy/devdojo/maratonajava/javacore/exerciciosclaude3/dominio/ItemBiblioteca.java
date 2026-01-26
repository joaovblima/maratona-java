package academy.devdojo.maratonajava.javacore.exerciciosclaude3.dominio;

public abstract class ItemBiblioteca {
    protected String titulo;
    protected int codigo;
    protected String status;

    public ItemBiblioteca(String titulo, int codigo, String status) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
