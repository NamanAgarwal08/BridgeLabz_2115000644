import java.util.regex.*;

public class IPAddressValidator {
    public boolean isValidIP(String ip) {
        return ip.matches("((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
    }
}