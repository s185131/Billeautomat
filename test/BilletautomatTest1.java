import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilletautomatTest1 {

    Billetautomat billetautomat = new Billetautomat();

    @Test
    void getBilletpris() {

        assertEquals(billetautomat.getBilletpris(), 10);

    }
}