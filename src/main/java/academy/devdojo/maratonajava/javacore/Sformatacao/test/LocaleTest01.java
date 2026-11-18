package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    static void main(String[] args) {
        Locale localeBr = new Locale("pt", "BR");
        Locale localeJp = new Locale("ja", "JP");
        Locale localeIt = new Locale("it", "IT");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeBr);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeJp);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeIt);

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
    }
}
