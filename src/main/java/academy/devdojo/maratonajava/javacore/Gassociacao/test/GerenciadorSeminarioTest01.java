package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class GerenciadorSeminarioTest01 {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("Murillo", 18);
        Aluno aluno2 = new Aluno("Geandyson", 19);
        Aluno aluno3 = new Aluno("Alerrandro", 18);
        Aluno aluno4 = new Aluno("Caio", 18);

        Seminario seminario1 = new Seminario("Como a IA esta afetando o ensino","Rua 42", new Aluno[] {aluno1,aluno3});
        Seminario seminario2 = new Seminario("Fake news na política","Rua 5", new Aluno[] {aluno1,aluno2,aluno3});
        Seminario seminario3 = new Seminario("Brigadeiro de Palma, inovação culinaria", "Rua", new Aluno[] {aluno1,aluno4});


        Professor professor1 = new Professor("Pai Zé", "Física", new Seminario[]{seminario1, seminario2});
        Professor professor2 = new Professor("Romildo", "Português", new Seminario[]{seminario1, seminario2, seminario3});
        Professor professor3 = new Professor("Muniz", "Agroindústria", new Seminario[]{seminario3});

        professor1.imprime();
        professor2.imprime();
        professor3.imprime();
    }
}
