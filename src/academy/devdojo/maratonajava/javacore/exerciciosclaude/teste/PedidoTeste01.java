package academy.devdojo.maratonajava.javacore.exerciciosclaude.teste;


import academy.devdojo.maratonajava.javacore.exerciciosclaude.dominio.PagamentoBoleto;
import academy.devdojo.maratonajava.javacore.exerciciosclaude.dominio.PagamentoCredito;
import academy.devdojo.maratonajava.javacore.exerciciosclaude.dominio.Pedido;

public class PedidoTeste01 {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(4000.0, new PagamentoBoleto());
        pedido1.processarPedido();

        System.out.println("---------------------------------------------");
        Pedido pedido2 = new Pedido(2000.0, new PagamentoCredito());
        pedido2.processarPedido();

    }
}
