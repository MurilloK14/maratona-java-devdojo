package academy.devdojo.maratonajava.exerciciosrevisão.test;

import academy.devdojo.maratonajava.exerciciosrevisão.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Murillo";
        funcionario1.idade = 18;
        funcionario1.salario = 1650;

        System.out.printf("Nome: %s%nIdade: %d%nSalário: %f%n", funcionario1.nome,funcionario1.idade, funcionario1.salario);

    }
}
