package Hodina5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DobraTovarnaTest {

    @Test
    void VyrobJidlo() {
        DobraTovarna t = new DobraTovarna();
        Jidlo j = t.vyrobJidlo("spekacek");
        assertTrue(Spekacek.class.isInstance(j));
    }
}
