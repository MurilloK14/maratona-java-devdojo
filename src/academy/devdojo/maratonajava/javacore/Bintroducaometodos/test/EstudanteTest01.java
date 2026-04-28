package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.impressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();

        estudante01.nome = "Murillo";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Kennedy";
        estudante02.idade = 19;
        estudante02.sexo = 'M';

        impressora.Imprime(estudante01);
        impressora.Imprime(estudante02);
    }
}
