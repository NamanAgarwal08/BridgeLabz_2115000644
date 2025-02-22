import java.util.regex.*;

public class LicensePlateValidator {
    public boolean isValidLicensePlate(String plate) {
        return plate.matches("^[A-Z]{2}\t{4}$");
    }
}