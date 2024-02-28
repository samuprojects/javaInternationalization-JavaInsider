package i18n;
/*
* O Locale padrão fica associado a JVM, no momento da inicialização da aplicação isso é atribuído.
* A informação é lida do sistema operacional, mas pode ser sobrescrita por parâmetros passados à JVM na inicialização do programa.
* Para fazer isso na IDE intellij clicar na parte superior com nome da classe executável, depois em Edit Configurations...
* Ou no menu Run / Edit Configurations...
* Na próxima tela do lado direito no mesmo espaçamento do Build and run clicar em Modify options, em seguida habilitar a opção
* Add VM options. Isso fará com que seja aberto uma seção VM options antes do nome da classe.
* Os parâmetros de exemplo são: -D  para passar parâmetros para a JVM, user.language + user.country separados por espaço, ficando como a seguir
*     -Duser.language=en -Duser.country=US
* não existe espaço entre o -D e o nome do parâmetro
* Com isso deixará de usar o padrão do sistema operacional para o especificado.
*
* */

import java.util.Locale;

public class AppResourceBundle5 {

    public static void main(String[] args) {
        System.out.println("Default locale: " + Locale.getDefault());
    }
}
