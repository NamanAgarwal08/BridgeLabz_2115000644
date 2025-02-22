import java.util.regex.*;

public class CreditCardValidator {
    public boolean isValidCreditCard(String card) {
        return card.matches("^4\\d{15}$") || card.matches("^5\\d{15}$");
    }
}