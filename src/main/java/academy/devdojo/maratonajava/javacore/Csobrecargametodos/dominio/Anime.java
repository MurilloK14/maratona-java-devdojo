package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipos;
    private int episodios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipos);
        System.out.println(this.episodios);
    }

    // forma mais simples de usar variáveis privadas por meio do init
    public void init( String nome, String tipos, int episodios){
        this.nome = nome;
        this.tipos = tipos;
        this.episodios = episodios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }
    public String getTipos(){
        return this.tipos;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public int getEpisodios(){
        return this.episodios;
    }
}
