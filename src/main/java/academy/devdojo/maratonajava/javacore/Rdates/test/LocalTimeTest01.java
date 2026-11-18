package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    static void main(String[] args) {
        LocalTime time = LocalTime.of(18,35,36);
        LocalTime agora = LocalTime.now();
        System.out.println(time);
        System.out.println(agora);
    }
}
