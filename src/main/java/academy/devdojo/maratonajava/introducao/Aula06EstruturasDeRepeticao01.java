package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    static void main(String[] args) {
        //while, do while, for

        int count = 0;
        while ( count < 10) {
            System.out.println(count);
            count++;
        }
        count = 0;
        do {
            System.out.println("dentro do do-while " + count++);
        } while (count < 10); // o "do while" sempre executa pelo menos uma vez, mesmo que não cumpra as condições, diferentemente do "while"

        for ( count = 0; count < 10; count ++) {
            System.out.println("dentro do for " + count);
        }
    }
}
