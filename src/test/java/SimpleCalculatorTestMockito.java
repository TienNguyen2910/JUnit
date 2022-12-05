import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTestMockito {
    private SimpleCalculator simpleCalculator;
    @BeforeEach
    void setUp() {
        simpleCalculator = Mockito.mock(SimpleCalculator.class);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addTest() {
        Mockito.when(simpleCalculator.Add(2,3)).thenReturn(4.00);
        assertEquals(4.00,simpleCalculator.Add(2,3));
    }

    @Test
    void substract() {
        Mockito.when(simpleCalculator.substract(3,1)).thenReturn(2.00);
        assertEquals(2.00, simpleCalculator.substract(3,1));
    }

    @Test
    void multiple() {
        Mockito.when(simpleCalculator.multiple(2,3)).thenReturn(6.00);
        assertEquals(6.00, simpleCalculator.multiple(2,3));
    }

    @Test
    void divide() {
        Mockito.when(simpleCalculator.divide(6,2)).thenReturn(3.00);
        assertEquals(3.00,simpleCalculator.divide(6,2));
    }
}