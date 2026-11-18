package academy.devdojo.maratonajava.javacore.Oexception.test;

import academy.devdojo.maratonajava.javacore.Oexception.dominio.LoginInvalidoException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {

        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "SSJ";
        System.out.println("Usuario");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}
