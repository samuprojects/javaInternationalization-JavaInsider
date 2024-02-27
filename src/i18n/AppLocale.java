package i18n;

import java.util.Arrays;
import java.util.Locale;

/*
* Toda vez que uma aplicação é iniciada a JVM associa um Locale a ela.
* Se a localização não for declarada explicitamente a JVM vai automaticamente buscar o Locale do sistema operacional
* É possível recuperar essa informação conforme exemplos abaixo no método main
* Outro ponto é que às vezes você não tem certeza se a JVM que está utilizando tem suporte a uma localização específica em termos de língua e país.
* Para isso existem os métodos getISOLanguages e getISOCountries que trazem essa informação da JVM.
*
* Para criar objetos Locale a recomendação é utilizar os métodos estáticos disponíveis (por exemplo, 3 vertentes do método of.,
* uma recebe apenas language, outra language + country, outra variants de idiomas num mesmo país).
* Há o forLanguageTag passa o padrão de string IETF BCP 47.
*
* */
public class AppLocale {

    public static void main(String[] args) {

        Locale defaultLocale = Locale.getDefault(); // chamando de forma estática o padrão de Locale do sistema
        System.out.println(defaultLocale);

        System.out.println(Arrays.toString(Locale.getISOLanguages())); // línguas suportadas pela JVM em uso
        System.out.println(Arrays.toString(Locale.getISOCountries())); // países suportados pela JVM em uso

        Locale locale1 = Locale.of("fr", "FR"); // na versão JDK 17 da amazon-corretto que estava usando não possuía o Locale.of
        System.out.println(locale1); // normalizado ao baixar a versão mais nova do openJDK 21

        Locale locale2 = Locale.forLanguageTag("fr-FR");
        System.out.println(locale2);


    }
}
