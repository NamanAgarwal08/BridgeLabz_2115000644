package JUnit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach
    public void setUp() {
        db = new DatabaseConnection();
        assertTrue(db.connect());
    }

    @AfterEach
    public void tearDown() {
        assertTrue(db.disconnect());
    }

    @Test
    public void testConnection() {
        assertTrue(db.connect());
    }
}
