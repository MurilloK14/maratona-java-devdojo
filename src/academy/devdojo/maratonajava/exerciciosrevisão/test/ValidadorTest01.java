package academy.devdojo.maratonajava.exerciciosrevisão.test;

import academy.devdojo.maratonajava.exerciciosrevisão.dominio.Validador;

public class ValidadorTest01 {
    static void main(String[] args) {
        String[] testes = {
            "123.456.789-00",
            "12345678900",
            "123.456.789-0",  // curto demais
            "123.456.78a-00", // tem letra
            "111.111.111-11"
        };
        for( String cpf : testes) {
            System.out.printf("%-18s -> válido? %b%n", cpf, Validador.validarCPF(cpf));
        }
    }
}
