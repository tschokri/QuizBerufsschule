import de.oszimt.ls.quiz.model.Model;
import de.oszimt.ls.quiz.model.Schueler;
import de.oszimt.ls.quiz.model.file.CSVParser;
import de.oszimt.ls.quiz.model.file.XMLParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CSVTest {

    @Test
    public void readCSV(){
        //model laden
        CSVParser csvParser = new CSVParser("src/test/java/CSVTest.csv");
        Model model = csvParser.laden();

        //checken
        Schueler s = model.getAlleSchueler().get(0);

        assertEquals(1,model.getAlleSchueler().size());
        assertEquals("csvVorname",s.getVorname());
        assertEquals("csvName",s.getName());
        assertEquals(1,s.getJoker());
        assertEquals(2,s.getBlamiert());
        assertEquals(3,s.getFragen());
    }
}
