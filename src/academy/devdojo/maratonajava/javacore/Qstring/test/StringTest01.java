package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    static void main(String[] args) {
        String nome = "William";// String constant pool
        String nome2 = "William";
        System.out.println(nome == nome2);
        String nome3 = new String("William");
        System.out.println(nome2 == nome3);
    }
}
