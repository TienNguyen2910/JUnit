import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
   private final SimpleCalculator calculator = new SimpleCalculator();
    @Test
    void addSuccess(){

        assertEquals(4,calculator.Add(2,2));
    }
    @Test
    public void substractSuccess(){
        assertEquals(-2,calculator.substract(5,7));
    }
    @Test
    public void multipleSuccess(){
        assertEquals(8,calculator.multiple(2,4));
    }
    @Test
    public void divideSuccess(){
        assertEquals(2, calculator.divide(6,3));
    }
    @Test
    public void divideFail(){
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculator.divide(2,0);
                });
    }
}