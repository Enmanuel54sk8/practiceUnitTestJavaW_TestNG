import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ConcurrentModificationException;

import static org.testng.Assert.*;

public class CalculadoraTest {

    private Calculadora calculadora;
    private int numeroUno;
    private int numeroDos;

    @BeforeClass
    public void instanceClass(){
        System.out.println("instance Class");
        calculadora = new Calculadora();
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("setUp all");
        numeroUno = 5;
        numeroDos = 10;
    }

   @Test
    public void testAdd(){
       System.out.println("testAdd");
       int expected = 27;
       assertEquals(expected, calculadora.add(20,7));
   }

   @Test
   public void testAddRandomNumbers(){
       System.out.println("testAddRandomNumbers");
        assertTrue(numeroUno+5 == numeroDos);
   }

   @Test(expectedExceptions = ConcurrentModificationException.class)
   public void testDetectarbuclesInfinitos(){
       System.out.println("\nLa prueba debe tirar la excepcion\n");
       calculadora.algoritmoOptimo();
   }

}
