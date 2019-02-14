import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeMethod
    public void instanceClass(){
        calculadora = new Calculadora();
    }

   @Test
    public void testAdd(){
       int expected = 27;
       assertEquals(expected, calculadora.add(20,7));
   }
}
