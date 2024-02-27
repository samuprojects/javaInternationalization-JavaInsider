package theory;

@SuppressWarnings("ALL")
public class PayAttentionResourceFile {

    /*
    *
    * Ao referenciar um ResourceBundle tomar cuidado com o nome e local onde o arquivo está.
    * Nos nossos exemplos estamos usando o nome Messages, o que implica que existe um arquivo chamado Messages (com seus Locales ou não),
    * com extensão properties na raiz do projeto (código fonte do projeto).
    * Por exemplo se mover os arquivos para o package i18n a aplicação deixará de funcionar.
    * Para corrigir será necessário prefixar com o pacote "i18n.Messages". Isso só é necessário se o arquivo não estiver na raiz.
    * O nome do ResourceBundle pode ser qualquer coisa porém deve ser o mesmo a ser referenciado na aplicação.
    *
    * */
}
