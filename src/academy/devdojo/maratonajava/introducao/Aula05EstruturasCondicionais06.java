package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando 1 como domingo
       byte dia = 7;
        if (dia >= 2 && dia <= 6 ) {
            System.out.println("Dia de semana");
        }
        else if (dia == 1 || dia == 7) {
            System.out.println("Final de semana");
        }
        else {
            System.out.println("Inválido");
        }
    }
}
