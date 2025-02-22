import java.util.regex.*;

public class SSNValidator {
    public boolean isValidSSN(String ssn) {
        return ssn.matches("\\d{3}-\\d{2}-\\d{4}");
    }
}