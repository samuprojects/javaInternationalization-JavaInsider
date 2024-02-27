package i18n;
/*
*
* Se não for informado um Locale válido o Java buscará o Locale padrão da aplicação
* No nosso exemplo será encontrado o pt-BR
* Porém, caso não tenha a ordem é buscar o informado, depois o Locale padrão e por último o properties que não tem sufixo.
* E caso não haja nenhum properties válido lançará uma Exceção do tipo MissingResourceException em tempo de execução, não aparece em tempo de compilação
* Por isso é sempre importante ter um Locale padrão sem sufixo, caso os demais falharem é esse que será carregado.
* Outro ponto é que todas as chaves definidas em um arquivo properties deve ser replicada nos outros Locales, pois se estiver ausente o comportamento segue como acima.
* Ou seja, todas as chaves devem estar presentes para não ocorrer de sua aplicação mostrar mensagens em outros idiomas quando uma chave estiver ausente.
*
* */


import java.util.Locale;
import java.util.ResourceBundle;

public class AppResourceBundle2 {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("Messages", Locale.of("fr", "FR"));
        System.out.println(bundle.getString("greetings"));


    }


}
