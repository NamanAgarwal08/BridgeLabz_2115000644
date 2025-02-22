package JUnit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    UserRegistration userReg = new UserRegistration();

    @Test
    public void testValidRegistration() {
        assertTrue(userReg.registerUser("JohnDoe", "john@example.com", "Password1"));
    }

    @Test
    public void testInvalidRegistration() {
        assertThrows(IllegalArgumentException.class, () -> userReg.registerUser("", "email.com", "123"));
    }
}
