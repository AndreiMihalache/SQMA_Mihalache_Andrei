import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest2 {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(0, -1);
        assertEquals(-1, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, -4);
        assertEquals(14, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(-1, 6);
        assertEquals(-6, result);
    }
}