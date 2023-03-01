package records;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecordTest {

    public record ObjectA (int id, String name, String apellido) {
    }

    @Test
    public void methodTest() {
        ObjectA objectA = new ObjectA(1, "name", "apellido");
        // objectA.id = 2; Cannot assign a value to final variable 'id'
        Assertions.assertEquals(1, objectA.id);
        Assertions.assertEquals("apellido", objectA.apellido());
    }

}
