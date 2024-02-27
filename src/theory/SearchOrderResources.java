package theory;

@SuppressWarnings("ALL")
public class SearchOrderResources {

    /*
    *
    * Simulando um cenário para entender a ordem de busca do ResourceBundle
    *
    * Nome do arquivo properties definido na aplicação M
    * Locale padrão utilizado pela JVM baseado no S.O. = Default = en_US
    * Locale padrão definido na aplicação pt_BR
    *
    * Ordem de busca e utilização
    *
    * 1) M_pt_BR
    * 2) M_pt    -> o país é opcional podendo ter um ResourceBundle só com Language
    * 3) M_en_US -> Default Locale utilizado pela JVM baseado no sistema operacional
    * 4) M_en
    * 5) M       -> ResourceBundle sem nenhum sufixo
    * 6) ERRO    -> caso todas as possibilidades sejam esgotadas sem um arquivo válido
    *
    *
    *
    * */
}
