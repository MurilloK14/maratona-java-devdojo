package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void imprime(){
        System.out.println(this.nome + " " + this.especialidade);
        for( Seminario seminario : seminarios) {
               System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal());
            if (seminario.getAlunos() == null) continue;
           for (Aluno aluno : seminario.getAlunos()) {
               System.out.println(aluno.getNome() + " " + aluno.getIdade());
           }
               System.out.println("----------------");
       }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor( String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String nome) {
        this.nome = nome;
    }
}
