package i18n;

import java.util.ListResourceBundle;

@SuppressWarnings("ALL")
public class Messages_fr_CA extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
            { "msg", "Bonjour!" },
            { "greetings", "Bienvenue!" },
        };
    }
}
