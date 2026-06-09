package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2022,5,25);
        LocalDate agora = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(agora);
    }
}
