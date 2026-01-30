package academy.devdojo.maratonajava.javacore.Nwrapper.string;

public class StringPerformanceTeste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long termino = System.currentTimeMillis();
        System.out.println("tempo gasto para string  = "+ (termino-inicio)+ " ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto +=i;
        }
    }
}
