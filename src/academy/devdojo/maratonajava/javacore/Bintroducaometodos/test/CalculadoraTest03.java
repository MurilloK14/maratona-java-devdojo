package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import java.sql.SQLOutput;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divisaoDoisNumeros(20, 10);
        System.out.println(result);
        System.out.println(calculadora.divisaoDoisNumeros(20, 10));
    }
}
