package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {

        Anime anime = new Anime();
    anime.init("One Piece", "TV", 1158);// forma de modificar valor usando init
        anime.setNome("One Piece");
        anime.setTipos("TV");
        anime.setEpisodios(1158);
        anime.imprime();

    }
}
