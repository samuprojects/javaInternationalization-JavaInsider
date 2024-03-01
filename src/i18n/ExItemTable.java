package i18n;
/*
* Implementar método para receber lista de itens de mercado + um locale.
* O método deve montar tabela com nome, preço e data de compra para cada item.
* As informações devem ser formatadas conforme o locale passado no método.
*
* */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class ExItemTable {

    public record Item(String nameKey, double price, LocalDate purchaseDate){} // record usado para gerar a lista de itens

    public static void main(String[] args) {

        var items = List.of(
                new Item("i102", 3.2, LocalDate.of(2023, 2, 1)),
                new Item("i134", 6.4, LocalDate.of(2023, 2, 10)),
                new Item("i100", 7, LocalDate.of(2023, 2, 5)),
                new Item("i164", 6.76, LocalDate.of(2023, 2, 8))
        );
        //var locale = Locale.of("pt", "BR");
        var locale = Locale.US; // testando com outro locale

        System.out.println(buildTable(items, locale));
    }

    private static String buildTable (List<Item> items, Locale locale){ // método para construção da tabela que retorna uma String
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.items", locale); // definindo referência ao ResourceBundle
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale); // para formatar o preço
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale); // para formatar a data

        return items
                .stream() // utilizando Stream API para facilitar a montagem
                .map(i -> { // mapeando cada um dos itens com String.format passando nome, preço, data (com String formatada)
                    String name = bundle.getString(i.nameKey); // variável com referência para a chave do Bundle
                    String price = nf.format(i.price); // variável com referência para o preço
                    String date = dtf.format(i.purchaseDate); // variável com referência para a data
                    return String.format("%s\t\t%s\t\t%s", name, price, date);
                })
                .collect(Collectors.joining("\n")); // coleta as informações indicando a separação das Strings, ou seja, dos itens, em quebra de linha
    }
}
