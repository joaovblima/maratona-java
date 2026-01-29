package academy.devdojo.maratonajava.javacore.Mexcecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        System.out.println("Arquivo criado.");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
