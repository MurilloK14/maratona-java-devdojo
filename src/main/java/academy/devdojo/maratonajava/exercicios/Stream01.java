package academy.devdojo.maratonajava.exercicios;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream01 {
    public record Conta (String titular, double saldo, boolean ativo){}

    public static void main(String[] args) {

        List<Conta> contas = List.of(
                new Conta("Murillo", 2500.0, true),
                new Conta("Lucas", 120.0, false),
                new Conta("Ana", 4500.0, true),
                new Conta("Beatriz", 50.0, false),
                new Conta("Carlos", 3100.0, true));

        List<String> collect = contas.stream()
                .filter(n -> n.ativo())
                .map(n -> n.titular.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect);

        Conta collect2 = contas.stream()
                .filter(n -> n.saldo >= 4000)
                .findFirst().orElseThrow(() -> new RuntimeException("Conta vip não encontrada"));

        System.out.println("Conta VIP encontrada: " + collect2.titular);
    }
}
