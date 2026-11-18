package academy.devdojo.maratonajava.javacore.Knum.test;

import academy.devdojo.maratonajava.javacore.Knum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Knum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Knum.dominio.TipoPagamento;



public class ClienteTest01 {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("Murillo", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("João", TipoCliente.PESSOA_JURIDICA);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);

    }

}
