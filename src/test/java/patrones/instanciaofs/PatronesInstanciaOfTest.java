package patrones.instanciaofs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatronesInstanciaOfTest {

    @Test
    public void instanceofTest() {
        Object obj = "instance of String";
        if (obj instanceof String s) {
            Assertions.assertEquals("instance of String", s);
        } else {
            Assertions.fail("Generar Error...");
        }
    }

    @Test
    public void instanceofDosTest() {
        Object obj = 1;
        if (obj instanceof String s) {
        } else {
            Assertions.fail("Generar Error...");
        }
    }

}
