package business;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BuergeramtTest {
    private Buergeramt buergi;

    @BeforeEach
    void setUp() throws Exception {
        String[] arri = new String[1];
        arri[0] = "nix";
        this.buergi = new Buergeramt("Hans", 9.0f, 10.0f, "Straße1", arri);
    }

    @AfterEach
    void tearDown() throws Exception {
        this.buergi = null;
    }

    @Test
    void test() {
        assertTrue(() -> this.buergi.getStrasseHNr().equals("Straße1")); 
    }
    
    @Test
    void test2() {
        Throwable exc= assertThrows(IllegalArgumentException.class,() -> {new Buergeramt("Elke",9.0f,10.0f,"Straße1", null);});
        assertEquals("Dienstleistungen duerfen nicht null sein.", exc.getMessage());
   
    }
}