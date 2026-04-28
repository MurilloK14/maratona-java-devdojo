package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionario01 = new Funcionarios();
        double[] numeros = {1000,2000,3000};
        funcionario01.setNome("Murillo");
        funcionario01.setIdade(18);
        funcionario01.setSalario(numeros);
        funcionario01.imprime();
    }
}
