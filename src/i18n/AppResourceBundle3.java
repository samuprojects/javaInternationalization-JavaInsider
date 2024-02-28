package i18n;
/*
* O Java permite trabalhar com objetos do próprio Java como ResourceBundle
* Para isso deve ser criado uma classe seguindo a nomenclatura padrão usada no arquivo properties
* Exemplo: Messages_fr_CA, em seguida faz ela estender de ListResourceBundle, que é uma classe abstrata
* Que possui um método abstrato em estilo matriz para receber o conceito de chave /valor
* Como foi criada dentro do pacote i18n foi referenciado no baseName
*
* */

import java.util.Locale;
import java.util.ResourceBundle;

public class AppResourceBundle3 {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("i18n.Messages", Locale.of("fr", "CA"));
        System.out.println(bundle.getString("greetings"));


    }


}
