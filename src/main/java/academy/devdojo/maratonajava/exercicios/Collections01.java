package main.java.academy.devdojo.maratonajava.exercicios;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Collections01 {
    static void main(String[] args) {
        List<String> nomes = List.of("Murillo", "Lucas",  "Murillo", "Martha", "Ana", "Lucas", "Beatriz");
        Set<String> nomesSet = lista(nomes);
        System.out.println("Nomes: " + nomesSet);
    }

public static Set<String> lista (List<String> nomes){
    Set<String> nomesSet = new LinkedHashSet<>(nomes);
    return nomesSet;
}
}
