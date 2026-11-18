package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    private String nome;
    private int idade;
    private double[] salario;
    private double soma = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getSoma() {
        return soma;
    }


    public void calcularMedia(){
           if(salario == null) {
               return;
           }

        for(double num : this.salario) {
            soma += num;
        }
           double media = soma/salario.length;
           System.out.println("Média dos salários: " + media);
    }
    public void imprime(){
        System.out.println("---------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.print("Salários: ");
        if(salario == null){
            return;
        }
        for (double salarios : salario) {
            System.out.print(salarios + ", ");
        }

        calcularMedia();
    }
}
