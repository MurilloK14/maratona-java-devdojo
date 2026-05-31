package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeUS = Locale.US;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] =NumberFormat.getCurrencyInstance(localeUS);
        nfa[1] =NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] =NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        nfa[3] =NumberFormat.getCurrencyInstance(localeIT);
        double valor = 10_000.2130;
        for ( NumberFormat numberFormat : nfa) {
            System.out.println( numberFormat.format(valor) );
        }
    }
}
