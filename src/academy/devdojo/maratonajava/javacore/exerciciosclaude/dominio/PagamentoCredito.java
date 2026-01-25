package academy.devdojo.maratonajava.javacore.exerciciosclaude.dominio;

public class PagamentoCredito implements Pagavel{
     public static final double TAXA = 0.025;

    @Override
    public double processar(double valor) {

        double aplicarTaxa = valor * TAXA;
        return  valor + aplicarTaxa;
    }




}
