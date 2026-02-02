package academy.devdojo.maratonajava.javacore.Nwrapper.string;

public class StringPerformanceTeste {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long termino = System.currentTimeMillis();
        System.out.println("tempo gasto para string  = "+ (termino-inicio)+ " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1000);
        termino = System.currentTimeMillis();
        System.out.println("tempo gasto para stringBuilder  = "+ (termino-inicio)+ " ms");
        String mensagem = "Essa é uma simples mensagem teste";
        sendMessage(mensagem);

    }

    private static void concatString(int tamanho) {
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto +=i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i <tamanho ; i++) {
            sb.append(i);
        }
    }

    private static void sendMessage(String message) {
        System.out.println("Mensagem enviada pelo usuario: "+ message);
    }
}
