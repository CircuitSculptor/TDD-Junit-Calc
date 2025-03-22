import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorDivideTest {
    Calculator myCalc;
    @BeforeEach
    void setup() {myCalc = new Calculator();}
    @Test
    void testDivideSuccess() {assertEquals(1, myCalc.divide(8,8));}
    @Test
    void testDivideFailure() {
        Exception ex = assertThrows(ArithmeticException.class, () -> {myCalc.divide(8, 0);});
        assertEquals("Cannot divide by zero", ex.getMessage());
    }
}
