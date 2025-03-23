import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorMultiplyTest {
    Calculator myCalc;

    @BeforeEach
    void setUp() {myCalc = new Calculator(); }
    @Test
    void testMultiplySuccess() {assertEquals(25, myCalc.multiply(5,5));}
    @Test
    void testMultiplyByZero() {
        Exception ex = assertThrows(UnsupportedOperationException.class, () -> {myCalc.multiply(10, 0);});
        assertEquals("Multiplication by Zero is not allowed", ex.getMessage());
    }
    @Test
    void testMultiplyFailure() {
        Exception ex = assertThrows(UnsupportedOperationException.class, () -> {myCalc.multiply(Integer.MAX_VALUE, 5);});
        assertEquals("Multiplication Overflow", ex.getMessage());
    }
}
