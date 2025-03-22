import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorSubtractTest {
    Calculator myCalc;
    @BeforeEach
    void setup() { myCalc = new Calculator(); }
    @Test
    void testSubtractSuccess() {assertEquals(2, myCalc.subtract(10,8));}
    @Test
    void testSubtractNegativeFailure() {
        Exception ex = assertThrows(IllegalStateException.class, () -> {myCalc.subtract(5, 10);});
        assertEquals("Negative results not allowed", ex.getMessage());
    }

    @Test
    void testSubtractFailure() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {myCalc.subtract(Integer.MIN_VALUE, 1);});
        assertEquals("Input is too small", ex.getMessage());
    }
}
