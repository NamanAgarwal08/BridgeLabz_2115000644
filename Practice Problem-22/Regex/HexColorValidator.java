import java.util.regex.*;

public class HexColorValidator {
    public boolean isValidHexColor(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
    }
}