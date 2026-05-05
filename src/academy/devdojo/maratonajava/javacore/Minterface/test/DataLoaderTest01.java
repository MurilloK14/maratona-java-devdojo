package academy.devdojo.maratonajava.javacore.Minterface.test;

import academy.devdojo.maratonajava.javacore.Minterface.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.FileLoader;

;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.loader();
        fileLoader.loader();

        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DatabaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
    }
}
