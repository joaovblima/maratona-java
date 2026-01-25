package academy.devdojo.maratonajava.javacore.exerciciosclaude.dominio;

public class PagamentoBoleto  implements Pagavel{
    public static final double TAXA = 3.50;

    @Override
    public double processar(double valor) {
        double aplicarTaxa = valor + TAXA;
        return  aplicarTaxa;
    }


}
