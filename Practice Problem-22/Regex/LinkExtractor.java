import java.util.regex.*;
import java.util.*;

public class LinkExtractor {
    public List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        Matcher matcher = Pattern.compile("https?://\\S+").matcher(text);
        while (matcher.find())
            links.add(matcher.group());
        return links;
    }
}