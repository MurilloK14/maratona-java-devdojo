package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    public Anime() {
        episodios = new int[1158];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.print(episodios[i]+ " ");
        }
        //for (int episodio : episodios){
           // System.out.print(episodio+ " ");
        //}
    }

}
