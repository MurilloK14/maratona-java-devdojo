package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {

       try{
            System.out.println("Escrevendo dados no arquivo");
            System.out.println("Abrindo arquivos");
            return "conexão aberta";
       }catch(Exception e){ e.printStackTrace();}
       finally{
           System.out.println("Fechando arquivos");
       }
        return null;
    }
}
