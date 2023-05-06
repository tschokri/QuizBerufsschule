import de.oszimt.ls.quiz.model.Model;
import de.oszimt.ls.quiz.model.Schueler;
import de.oszimt.ls.quiz.model.Spielstand;
import de.oszimt.ls.quiz.model.file.XMLParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class XMLTest {

    @Test
    public void xmlRead(){
        XMLParser xmlParser = new XMLParser("src/test/java/XmlTest.xml");
        Model model = xmlParser.laden();

        //check student
        assertEquals(1,model.getAlleSchueler().size());
        assertEquals("vorname",model.getAlleSchueler().get(0).getVorname());

    }

    @Test
    public void xmlWrite(){
        //create empty Model
        Model model = new Model();
        model.setSpielstand(new Spielstand("Lehrer",0,"Schueler",0));
        model.getAlleSchueler().add(new Schueler("nname","vname",0,0,0));

        //save model
        XMLParser xmlParser = new XMLParser("src/test/java/XmlTestW.xml");
        xmlParser.speichern(model);

        //laden zum checken
        Model modelNew = xmlParser.laden();

        assertEquals(model.getAlleSchueler().size(), modelNew.getAlleSchueler().size());
        assertEquals(model.getAlleSchueler().get(0).getVorname(), modelNew.getAlleSchueler().get(0).getVorname());
    }
}
