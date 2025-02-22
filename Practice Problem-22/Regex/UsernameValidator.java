import java.util.regex.*;
public class UsernameValidator {
    public boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }
}
