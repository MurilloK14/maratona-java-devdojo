package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipos;
    private int episodios;
    private String genero;
    private String estudio;

    //Construtor é a primeira linha a ser executada, ela é criada automaticamente, é possivel colocar todas as variaveis nela
    public Anime( String nome, String tipos, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipos = tipos;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime( String nome, String tipos, int episodios, String genero, String estudio){
        this(nome, tipos, episodios, genero);
       this.estudio = estudio;
    }
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipos);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
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
