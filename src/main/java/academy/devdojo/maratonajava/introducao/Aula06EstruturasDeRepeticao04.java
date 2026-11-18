package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // condição valorParcela >= 1000
        double valorTotal = 30000;
        double valorParcela;
        for (int i = 0; i <= valorTotal; i++) {
            valorParcela = valorTotal / i;
            if(valorParcela < 1000){
                break;
            }
            System.out.println(i+ " valor da parcela: " + valorParcela + "R$");

        }
    }
}
