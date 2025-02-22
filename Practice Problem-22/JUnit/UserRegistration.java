package JUnit;

public class UserRegistration {
    public boolean registerUser(String username, String email, String password) {
        if (username.isEmpty() || !email.contains("@") || password.length() < 8) {
            throw new IllegalArgumentException("Invalid input");
        }
        return true;
    }
}