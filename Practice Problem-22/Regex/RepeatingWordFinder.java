import java.util.regex.*;
import java.util.*;

public class RepeatingWordFinder {
    public Set<String> findRepeatingWords(String text) {
        Set<String> repeated = new HashSet<>();
        Matcher matcher = Pattern.compile("\\b(\\w+)\\s+\\1\\b").matcher(text);
        while (matcher.find())
            repeated.add(matcher.group(1));
        return repeated;
    }
}
