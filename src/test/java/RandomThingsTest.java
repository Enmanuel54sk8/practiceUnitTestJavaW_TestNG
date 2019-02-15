import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RandomThingsTest {

    //Asserts con comentarios...
    private int[] numerosRandom;
    private RandomThings randomThings;

    @BeforeMethod
    public void setUp() {
        randomThings = new RandomThings();
        numerosRandom = randomThings.returnInts();

        System.out.println(numerosRandom[0]);
        System.out.println(numerosRandom[1]);
    }

    @Test
    public void testReturnIntsPrimerNumeroMayorQueSegundo() {
        assertTrue(numerosRandom[0] >= numerosRandom[1], "Se espera el primero que sea mayor");
    }

    @Test
    public void testReturnIntsNumerosIguales() {
        assertTrue(numerosRandom[0] == numerosRandom[1], "se espera que sean iguales!");
    }

}