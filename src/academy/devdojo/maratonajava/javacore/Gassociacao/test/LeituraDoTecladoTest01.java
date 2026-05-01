package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual é o seu nome? ");
        String nome = input.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = input.nextInt();

        System.out.print("Digite 'M' ou 'F' para seu sexo  ");
        char sexo = input.next().charAt(0);

        System.out.println(nome);
        System.out.println(idade);

        if (sexo == 'M') {
            System.out.println("Masculino");
        }
        else if (sexo == 'F'){
            System.out.println("Feminino");

        }
    }
}
