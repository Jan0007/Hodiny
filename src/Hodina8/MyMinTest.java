package Hodina8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMinTest {
    @Test
    public void testPositive() {
        int out = MyMin.min(1, 2);
        assertEquals(1, out);
    }

    @Test
    public void testNegative() {
        int out = MyMin.min(-1, -2);
        assertEquals(-2, out);
    }
}
