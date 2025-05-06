package lab15.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(24, calculator.multiply(6, 4));
    }

    @Test
    void testDivide() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
        assertEquals("Хуваагч 0 байж болохгүй.", exception.getMessage());
    }
}
