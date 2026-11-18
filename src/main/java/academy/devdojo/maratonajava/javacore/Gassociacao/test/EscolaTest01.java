package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    static void main(String[] args) {
        Professor professor = new Professor("Pai Zé");
        Professor professor2 = new Professor("Rinaldo");
        Professor professor3 = new Professor("Vitória");
        Professor[] professores = {professor, professor2, professor3};
        Escola escola = new Escola("IFAL", professores);

        escola.imprime();
    }
}
