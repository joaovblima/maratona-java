package academy.devdojo.maratonajava.javacore.Kinterfaces.teste;

import academy.devdojo.maratonajava.javacore.Kinterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Kinterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();


        fileLoader.remove();
        databaseLoader.remove();

        fileLoader.checkPermission();
        databaseLoader.checkPermission();
    }
}
