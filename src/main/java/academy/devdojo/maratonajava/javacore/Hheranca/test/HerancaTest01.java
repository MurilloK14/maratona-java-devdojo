package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCEP("12345678");
        Pessoa pessoa = new Pessoa("Murillo");
        pessoa.setCpf("12345678");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Joao");
        funcionario.setCpf("87654321");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3000);
        funcionario.imprime();


    }
}
