import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VoetbalclubTest {

    @Test
    void checkEmptyNaam(){
        Voetbalclub v1 = new Voetbalclub("");
        assertEquals("fc", v1.getNaam());
    }

    @Test
    void checkNullNaam(){
        Voetbalclub v1 = new Voetbalclub(null);
        assertEquals("fc", v1.getNaam());
    }

    @Test
    void checkNaam(){
        Voetbalclub v1 = new Voetbalclub("Feyenoord");
        assertEquals("Feyenoord", v1.getNaam());
    }

    @Test
    void testGewonnen(){
        Voetbalclub v1 = new Voetbalclub("");
        v1.verwerkResultaat('w');
        assertEquals(3, v1.aantalPunten());
    }

    @Test
    void testVerloren(){
        Voetbalclub v1 = new Voetbalclub("");
        v1.verwerkResultaat('v');
        assertEquals(0, v1.aantalPunten());
    }

    @Test
    void testGelijk(){
        Voetbalclub v1 = new Voetbalclub("");
        v1.verwerkResultaat('g');
        assertEquals(1, v1.aantalPunten());
    }

    @Test
    void testAnderKarakter(){
        Voetbalclub v1 = new Voetbalclub("");
        v1.verwerkResultaat('s');
        assertEquals(0, v1.aantalGespeeld());
    }

    @Test
    void meerdereResultaten(){
        Voetbalclub v1 = new Voetbalclub("");
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('v');
        assertEquals(8, v1.aantalPunten());
    }
}