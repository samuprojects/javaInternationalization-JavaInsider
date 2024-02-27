package theory;

@SuppressWarnings("ALL")
public class LocaleConcepts {

    /*
    *
    * O primeiro conceito a falar de internacionalização é o Locale, que representa uma localização.
    * Essa localização pode ser geográfica, política, cultural, etc. O importante é sempre ter um Locale associado.
    * O Locale possui informações dentro dele porém o que mais importa são as de Language e Country, ou seja, vamos considerar um Locale como um par de informações
    * Esse par de informações definirá uma localização no mundo. Por exemplo en US = inglês/Estados Unidos, en GB = inglês/Inglaterra
    * Geralmente o idioma será definido por duas letras minúsculas e o país por duas letras maiúsculas, e essa combinação não é aleatória.
    * São padrões internacionais a saber ISO 639 para Language e ISO 3166 para Country, e a junção dos dois resulta em uma outra norma
    * a IETF BCP 47, que define em termos de uma string a combinação de language e country conforme a seguir: en-US, en-GB.
    * Isso é importante porque o Java permite você utilizar objetos do tipo Locale que podem ser construídos com base em Language,  Country ou com base
    * no padrão BCP 47
    *
    *      Locale                  ISO 639            ISO 3166
    * Language Country             Language     +     Country
    *    en      US                           en-US --
    *    en      GB                           en-GB  |___ IETF BCP 47
    *    fr      CA                           fr-CA  |
    *    pt      BR                           pt-BR --
    *
    * */
}
