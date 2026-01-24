package academy.devdojo.maratonajava.javacore.exerciciosclaude.dominio;

public class Pedido {
    private double valor;
    TipoPagamento tipoPagamento;

    public Pedido(double valor, TipoPagamento tipoPagamento) {
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "valor=" + valor +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
