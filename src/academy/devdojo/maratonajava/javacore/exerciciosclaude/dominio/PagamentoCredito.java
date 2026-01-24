package academy.devdojo.maratonajava.javacore.exerciciosclaude.dominio;

public class PagamentoCredito implements Pagavel{
     public static final double TAXA = 0.025;

    @Override
    public double processar(double valor) {
        return 0;
    }

    @Override
    public void processarRelatorio() {

    }
}
