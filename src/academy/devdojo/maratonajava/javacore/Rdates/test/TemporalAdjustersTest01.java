package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;

public class TemporalAdjustersTest01 {
    static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withMonth(1);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
