package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime time = LocalTime.of(22,15,45);
        LocalDate date = LocalDate.of(2024,05,25);

        LocalDateTime ldt1 = date.atTime(time);
        ldt1 = time.atDate(date);

        System.out.println(ldt1);
    }
}
