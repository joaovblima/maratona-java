package academy.devdojo.maratonajava.javacore.Ienum.teste;

import academy.devdojo.maratonajava.javacore.Ienum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Ienum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Ienum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Lima", TipoCliente.PESSOA_FISICA);
        cliente1.setTipoPagamento(TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(200));
    }
}
