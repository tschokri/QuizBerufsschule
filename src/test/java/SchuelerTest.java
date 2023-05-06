import de.oszimt.ls.quiz.model.Schueler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SchuelerTest {

    /**
     * Testet, ob ein Vorname im Schüler angelegt wurde
     */
    @Test
    public void testVorname(){
        Schueler s = new Schueler("nachname","vorname",0,0,0);

        assertEquals("vorname",s.getVorname());
    }

    /**
     * Testet, ob die Methode Fullname angelegt wurde
     */
    @Test
    public void testFullname(){
        Schueler s = new Schueler("nachname","vorname",0,0,0);

        assertEquals("vorname nachname",s.getFullName());
    }
}
