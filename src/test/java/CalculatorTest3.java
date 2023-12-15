import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest3 {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1000000, 10101);
        assertEquals(1010101, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 100);
        assertEquals(-99, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(0, 500);
        assertEquals(0, result);
    }
}