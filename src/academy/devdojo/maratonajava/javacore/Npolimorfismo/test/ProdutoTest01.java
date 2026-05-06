package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Produto produto = new Computador("NUC107", 11000);
        Produto produto2 = new Tomate("Tomate Rosa", 10);
        CalculadoraImposto.calcularImposto(produto);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(produto2);


    }
}
