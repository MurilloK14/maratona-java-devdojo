package academy.devdojo.maratonajava.exercicios;

import java.util.*;

public class Collections02 {
    public static void main(String[] args) {
        String texto = "java spring java docker java redis docker";
        List<String> palavras = List.of(texto.split(" "));
        Map<String, Integer> contador = new LinkedHashMap<>();

        for(String palavra: palavras){
            contador.put(palavra, contador.getOrDefault(palavra,0)+ 1);
        }
        System.out.println(contador);
    }
}
