package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O GRANDE SOFTWARE DE PREVISÃO DO FUTURO");
        System.out.println("\nDigite sua pergunta e eu responderei com sim ou não");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' ') {
        System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }
    }
}
