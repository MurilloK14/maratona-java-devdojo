package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    static void main(String[] args) {

        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArryIndexOutOfBoundsException");
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch(NullPointerException e){
            System.out.println("NulllPointerException");
        }catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }catch(RuntimeException e){
            System.out.println("RuntimeException");
        }

       try{
           talvezLanceException();
       }catch(SQLException | IOException e){
           System.out.println("SQLException | FileNotFoundException");
       }
    }
        private static void  talvezLanceException() throws SQLException, FileNotFoundException {
        throw new SQLException();
        }
}
