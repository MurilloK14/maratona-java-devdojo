package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    static void main(String[] args) {
        double valorTotal = 30000;
        double valorParcela;
        for (int i = (int) valorTotal; i >=1 ; i--) {
            valorParcela = valorTotal / i;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println(i+ " valor da parcela: " + valorParcela + "R$");

        }
    }
}
