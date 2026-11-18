package academy.devdojo.maratonajava.javacore.Knum.dominio;

public class Cliente {
    public enum TipoPagamento {
        DEBITO, CREDITO
    }

    private String nome;
    private TipoCliente tipoCliente;



    public Cliente(String nome, TipoCliente tipoCliente ) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

}
