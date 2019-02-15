import java.util.Random;

import static org.testng.Assert.*;

public class FactorialTest {
    private Factorial factorial;

    @org.testng.annotations.BeforeClass
    public void setUpClass() throws Exception {
        System.out.println("instanciando la clase");
        factorial = new Factorial();
    }



    /**
     * Test of factorial method, of class Factorial.
     */
    @org.testng.annotations.Test
    public void testFactorial() {

        System.out.println("factorial");
        Random random = new Random();

        int facto = Integer.parseInt(random.ints(1,0,100).toString());
        System.out.println(""+facto);
        int expected = 0;

        assertTrue(factorial.factorial(facto) >= expected);
    }
}