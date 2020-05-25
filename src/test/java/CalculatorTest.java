import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        int addTotal = calculator.add(2,2);
        assertEquals(4, addTotal);
    }

    @Test
    public void canSubtract() {
        int subtractTotal = calculator.subtract(5,3);
        assertEquals(2, subtractTotal);
    }

    @Test
    public void multiply(){
        int multiplyTotal = calculator.multiply(4,4);
        assertEquals(16, multiplyTotal);
    }

    @Test
    public void canDivide(){
        double divideTotal = calculator.divide(10,2);
        assertEquals(5, divideTotal, 0.00);
    }
}
