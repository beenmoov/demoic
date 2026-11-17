package test.java.tn.eni;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void testGreet() {
        assertEquals("Hello DevOps", new App().greet());
    }
}