package academy.devdojo.maratonajava.javacore.Pformatacao.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBr = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat [] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance(localeJP);
        nf[1] = NumberFormat.getInstance(localeBr);
        nf[2] = NumberFormat.getInstance(localeIT);
        nf[3]  = NumberFormat.getInstance(localeDefault);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
