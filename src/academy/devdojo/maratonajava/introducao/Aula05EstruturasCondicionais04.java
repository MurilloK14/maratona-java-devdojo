package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;
        double imposto;

        if (salario >= 0 && salario <= 34712) {
           imposto = salario * (9.70/100);
        }
        else if (salario > 34712 && salario <= 68507) {

            imposto = salario * (37.35/100);
        }
        else {
            imposto = salario * (49.50/100);
        }
        System.out.println(imposto);
    }
}
