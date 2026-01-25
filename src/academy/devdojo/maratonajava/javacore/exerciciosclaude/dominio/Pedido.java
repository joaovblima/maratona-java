package academy.devdojo.maratonajava.javacore.exerciciosclaude.dominio;

public class Pedido {
    private double valor;
    private Pagavel formaPagamento;

    public Pedido(double valor, Pagavel formaPagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pagavel getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagavel formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "valor=" + valor +
                ", formaPagamento=" + formaPagamento +
                '}';
    }

    public void processarPedido() {
        double valorComTaxa = formaPagamento.processar(this.valor);
        System.out.println("Relatório do pedido: ");
        System.out.println("Valor do pedido: R$ "+this.valor);
        System.out.println("Valor da taxa: "+formaPagamento);
        System.out.println("Valor com a taxa: R$"+ valorComTaxa);
    }
}
