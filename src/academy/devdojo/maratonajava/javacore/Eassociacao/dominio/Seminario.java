package academy.devdojo.maratonajava.javacore.Eassociacao.dominio;

public class Seminario {
    private String titulo;
    Local local;
    Aluno[] alunos;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime() {
        System.out.println(this.titulo);
        System.out.println(this.local.getEndereco());
        if (alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
