package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
 void loader();
 default void checkPermission() {
     System.out.println("Fazendo checagem de permissões");
 }

 public static void retrieveMaxDataSize(){
     System.out.println("Dentro do retrieveMaxDataSize");
 }

}
