package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public class DatabaseLoader implements DataLoader, DataRemove {
    @Override
    public void loader() {
    System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um banco de dados");
    }
    @Override
    public void checkPermission() {
        System.out.println("Fazendo checagem de permissões do banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
