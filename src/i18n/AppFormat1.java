package i18n;
/*
* Para formatar números e moedas podemos escolher um formatador passando um Locale específico
* Por exemplo, NumberFormat chamando um getNumberInstance. Depois chamamos o format passando a variável para aplicar as mudanças conforme o Locale informado
* Para moeda muda apenas de getNumberInstance para getCurrencyInstance
*
* */

import java.text.NumberFormat;
import java.util.Locale;

public class AppFormat1 {

    public static void main(String[] args) {
        double n = 3456.78; // número cobaia para demonstrar os tipos de formatações

        NumberFormat nf1 = NumberFormat.getNumberInstance(Locale.of("pt", "BR"));
        NumberFormat nf2 = NumberFormat.getNumberInstance(Locale.of("en", "US"));

        System.out.println(n);
        System.out.println(nf1.format(n));
        System.out.println(nf2.format(n));

        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.of("en", "US"));

        System.out.println(nf3.format(n));
        System.out.println(nf4.format(n));
    }
}
