package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero02+numero01);

        // resto (%)
        int resto = 20 % 3;
        System.out.println(resto);

        //para valores booleanos < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("Dez é maior que vinte? " + isDezMaiorQueVinte);
        System.out.println("Dez é menor que vinte? " + isDezDiferenteDeVinte);
        System.out.println("Dez é igual a vinte? " +isDezIgualAVinte);
        System.out.println("Dez é igual a dez? " + isDezIgualADez);
        System.out.println("Dez é diferente de vinte? " + isDezDiferenteDeVinte);

        //Operadores Lógicos '&&'(AND, e) '||' (or, ou) !(not, não)

        int idade = 35;
        float salario = 3500F;
        boolean isDetroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Está dentro da Lei de maior que trinta? " + isDetroDaLeiMaiorQueTrinta);
        System.out.println("Está dentro da Lei de menor que trinta? " + isDentroDaLeiMenorQueTrinta);
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000;
        boolean isPS5Compravel = valorTotalContaCorrente >= valorPlayStation || valorTotalContaPoupanca >= valorPlayStation;
        System.out.println("É possível comprar o PS5? " + isPS5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        // bonus += 1000 é a mesma coisa que bonus = bonus + 1000
        bonus++; // adiciona 1
        bonus -= 1000;
        bonus *= 2;
        System.out.println(bonus);

    }
}
