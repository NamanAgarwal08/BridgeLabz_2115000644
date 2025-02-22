import java.util.regex.*;
import java.util.*;

public class EmailExtractor {
    public List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        Matcher matcher = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}").matcher(text);
        while (matcher.find())
            emails.add(matcher.group());
        return emails;
    }
}