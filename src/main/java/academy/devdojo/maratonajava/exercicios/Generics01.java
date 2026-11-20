package academy.devdojo.maratonajava.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Generics01 {

    public static void main(String[] args) {

        List<Integer> inteiros = List.of(10, 20, 30);
        List<Double> decimais = List.of(1.5, 2.5, 4.0);
        System.out.println("Soma inteiros: " + somar(inteiros));
        System.out.println("Soma decimais: " + somar(decimais));
    }

    public static <T extends Number> double somar (List<T> list){
        double soma = 0.0;
        for (T t : list) soma += t.doubleValue();

        return soma;
    }
}
