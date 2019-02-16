import java.util.Random;

import static org.testng.Assert.*;

public class FactorialTest {

    /**
     * Test of factorial method, of class Factorial.
     */
    @org.testng.annotations.Test
    public void testFactorial() {
        Factorial factorial = new Factorial();

        System.out.println("factorial");
        Random random = new Random();
        int facto = random.nextInt(5);
        int expected = 0;
        System.out.println(facto + "");
        assertTrue(factorial.factorial(facto) >= expected);
    }
}