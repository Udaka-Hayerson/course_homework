package java_professional.lesson_notes.eleventh_lesson.jaxb_test;

import java.io.File;
import java.util.Date;
//import javax.xml.bing.JAXBException;

// xjc.exe = XML->Java , schemagen.exe Java->XML
// not work
public class JAXBTest {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Book book1 = new Book("Author1", "Title1", 300.5, new Date());
        Book book2 = new Book("Author2", "Title2", 300.7, new Date());
        try {
            File file = new File("C:\\Users\\Nickolas\\IdeaProjects\\" +
                    "untitled666\\src\\java_professional\\lesson_notes\\eleventh_lesson\\jaxb_test\\output.xml");
            /*
            JAXBContext jaxbcontext = JAXBContext.newInctence(Catalog.class);
            Marshaller marshaller = jaxbcontext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FOTMATTED_OUTPUT, true);
            marshaller.marshal(catalog, file);
            marshaller.marshal(catalog, System.out);
            Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
            catalog = (Catalog) unmarshaller.unmarshal(file);
            sout(catalog);
            */

        } catch (Exception e) { // JAXBException
            e.printStackTrace();
        }
    }
}
