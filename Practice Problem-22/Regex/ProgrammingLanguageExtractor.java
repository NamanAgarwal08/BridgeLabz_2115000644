import java.util.regex.*;
import java.util.*;

public class ProgrammingLanguageExtractor {
    public List<String> extractLanguages(String text) {
        List<String> langs = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        while (matcher.find())
            langs.add(matcher.group());
        return langs;
    }
}