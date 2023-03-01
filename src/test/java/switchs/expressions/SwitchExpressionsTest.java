package switchs.expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwitchExpressionsTest {

    public enum DiaDeLaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }


    @Test
    public void methodTest() {
        DiaDeLaSemana dia = DiaDeLaSemana.MARTES;
        int numeroDia = switch (dia) {
            case LUNES -> 1;
            case MARTES -> 2;
            case MIERCOLES -> 3;
            case JUEVES -> 4;
            case VIERNES -> 5;
            case SABADO -> 6;
            case DOMINGO -> 7;
        };
        Assertions.assertEquals(2, numeroDia);
    }


}
