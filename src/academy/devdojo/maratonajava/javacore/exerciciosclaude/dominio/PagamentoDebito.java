package academy.devdojo.maratonajava.javacore.exerciciosclaude.dominio;

public class PagamentoDebito implements Pagavel {
    public static final double TAXA = 0.01;

    @Override
    public double processar(double valor) {
        double aplicarTaxa = valor * TAXA;
        return  valor + aplicarTaxa;
    }

}
