package academy.devdojo.maratonajava.javacore.Csobercargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobercargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.setNome("Naruto");
        anime.setEpisodios(700);
        anime.setGenero("Aventura");

        anime.imprime();
    }
}
