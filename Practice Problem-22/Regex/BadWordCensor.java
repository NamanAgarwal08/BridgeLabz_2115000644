import java.util.regex.*;

public class BadWordCensor {
    public String censorBadWords(String text, String[] badWords) {
        for (String word : badWords)
            text = text.replaceAll("\\b" + word + "\\b", "****");
        return text;
    }
}