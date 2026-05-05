package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void loader() {
        System.out.println("Carreegando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Fazendo checagem de permissões do arquivo");
    }


}
