package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.dominio.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Collections03{
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>(List.of(
                new Produto("Teclado", 150.0),
                new Produto("Mouse", 80.0),
                new Produto("Monitor", 900.0),
                new Produto("Headset", 150.0),
                new Produto("Mousepad", 80.0)
        ));

        produtos.sort(
                Comparator.comparing(Produto::getValor)
                        .thenComparing(Produto::getNome));

        System.out.println(produtos);

    }
}
