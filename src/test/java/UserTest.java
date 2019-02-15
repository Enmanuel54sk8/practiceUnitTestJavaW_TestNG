import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

public class UserTest {

    private User usuario;

    @BeforeClass
    public void objectNull() {
        usuario = null;
    }


    @Test(enabled = false)//el caso no corre
    public void classIsNullTest() {

        assertNull(usuario);

        usuario = new User();
        assertNotNull(usuario);

    }

}