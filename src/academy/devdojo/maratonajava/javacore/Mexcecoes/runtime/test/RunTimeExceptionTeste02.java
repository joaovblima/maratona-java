package academy.devdojo.maratonajava.javacore.Mexcecoes.runtime.test;

public class RunTimeExceptionTeste02 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados no arquivo.");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("fechando recurso liberado pelo so");
        }
        return null;
    }
}
