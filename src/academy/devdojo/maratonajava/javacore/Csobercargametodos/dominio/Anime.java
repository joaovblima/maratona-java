package academy.devdojo.maratonajava.javacore.Csobercargametodos.dominio;

public class Anime {
    private String nome;
    private int episodios;
    private String genero;

    public Anime(String nome, int episodios, String genero) {
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;

    }

    public Anime() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }
}
