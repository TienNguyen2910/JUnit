import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.EnumSource;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    private static StudentService studentService;
   @BeforeEach
   public static void setup(){
       studentService = Mockito.mock(StudentService.class);
    }

    @Test
    void getAverageTest() {
        Mockito.when(studentService.getAverage()).thenReturn(7.5);
        assertEquals(7.5,studentService.getAverage());
    }
}