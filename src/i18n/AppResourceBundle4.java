package i18n;
/*
* Formatando frases, textos mais complexos de acordo com o Locale especificado.
* Exemplos:
* pt_BR ==> Fui ao shopping e comprei 2 camisas. Custou R$200,00.
* en_GB ==> I went to the mall and bought 2 shirts. They cost £ 200.00.
* Vamos usar o MessageFormat para isso.
* Para tornar genérico a frase substituímos os valores por {} e dentro colocamos 0 para indicar que é o primeiro parâmetro e depois o qualificador
* No nosso exemplo informamos que é um number. No caso da moeda usamos 1 para indicar como segundo parâmetro, depois o qualificador number,
* E por último ainda classificamos como currency para indicar o padrão moeda.
* Esse padrão está na documentação do MessageFormat.
* Após criar o Locale, o ResourceBundle, a key (exibindo sem a formatação), utilizamos o MessageFormat para definir o padrão baseado nos Locales e properties
*
* */

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class AppResourceBundle4 {

    public static void main(String[] args) {

        //Locale loc = Locale.of("pt", "BR");
        Locale loc = Locale.of("en", "GB");
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", loc);

        String sentence = bundle.getString("sentence");
        System.out.println(sentence);

        MessageFormat mf = new MessageFormat(sentence, loc);
        String formatted = mf.format(new Object[]{100,2000.0});
        System.out.println(formatted);


    }
}
