package i18n;
/*
* Formatando data hora conforme Locale (específico ou padrão do sistema)
* Vamos começar utilizando o objeto LocalDateTime que consegue representar data/hora simultaneamente
* Para formatar chamamos um format passando a instância de DateTimeFormatter que permite já formatar um estilo com o ofLocalizedDateTime
* Esse método já retornará uma String que podemos imprimir na tela.
* Se quiser especificar um Locale pode chamar withLocale dentro do objeto DateTimeFormatter após a formatação do estilo
*
* */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class AppFormat2 {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2000,5, 10, 14, 35, 10);
        System.out.println(ldt);

        String formatted = ldt.format(
                DateTimeFormatter
                        .ofLocalizedDateTime(FormatStyle.MEDIUM)
                        .withLocale(Locale.of("en", "US"))
        );
        System.out.println(formatted);
    }
}
