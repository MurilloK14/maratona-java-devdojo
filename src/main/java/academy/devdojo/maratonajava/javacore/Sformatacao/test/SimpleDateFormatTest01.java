package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String pattern ="'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        System.out.println(sdf2.format(new Date()));
        try{
            System.out.println(sdf2.parse("Amsterdam 05 de junho de 2026"));
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
