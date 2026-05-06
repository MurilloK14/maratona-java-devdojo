package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public  String DataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public String getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(String dataValidade) {
        DataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
