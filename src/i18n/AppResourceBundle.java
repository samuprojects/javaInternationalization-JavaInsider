package i18n;
/*
*
* O que dá vida ao processo de internacionalização é o ResourceBundle
* Dentro da pasta de estrutura do projeto (src ou outra pasta de código-fonte) criar um new File
* com nome Messages.properties (o nome do arquivo pode ser qualquer coisa, porém com um ".properties" no final)
* Esse arquivo vai conter pares de chave/valor separados por "=", onde cada par é uma língua.
* Na sequência lemos o arquivo pela aplicação utilizando um objeto ResourceBundle.
* O segredo para internacionalização é ter vários arquivos properties que repetem as chaves, porém com valores diferentes.
* Com isso teremos strings diferentes para Locales diferentes.
* Para testar isso criamos um Messages_pt_BR.properties para utilização com Locale pt-BR e o arquivo
* Messages.properties é o padrão utilizado quando você não tem nenhum Locale especificado.
* Quando passamos um Locale específico o Java vai buscar o arquivo properties correspondente
* Existem regras para isso, como ordem de procura, entre outras.
*
* */


import java.util.Locale;
import java.util.ResourceBundle;

public class AppResourceBundle {

    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("Messages", Locale.of("pt", "BR")); // baseName é o nome do arquivo de properties

        String someText = bundle.getString("msg"); // key é a chave que vem antes do sinal de "=" no arquivo Messages.properties
        System.out.println(someText);

    }


}
