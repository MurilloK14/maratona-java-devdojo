package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;


public class ProdutoTest02 {
    static void main(String[] args) {
        Produto produto = new Computador("Asus", 5000);
        System.out.println("Computador: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a pagar: " + produto.calcularImposto());

        System.out.println("--------------");
        Produto produto2 = new Tomate("Americano", 20);
        System.out.println("Tomate: " + produto2.getNome());
        System.out.println("Valor: " + produto2.getValor());
        System.out.println("Imposto a pagar: " + produto2.calcularImposto());





    }
}
