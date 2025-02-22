import java.util.regex.*;
import java.util.*;

public class CapitalizedWordExtractor {
    public List<String> extractCapitalizedWords(String text) {
        List<String> words = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b[A-Z][a-z]+\\b").matcher(text);
        while (matcher.find())
            words.add(matcher.group());
        return words;
    }
}