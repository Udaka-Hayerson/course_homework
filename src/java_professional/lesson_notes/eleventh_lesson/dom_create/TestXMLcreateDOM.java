package java_professional.lesson_notes.eleventh_lesson.dom_create;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class TestXMLcreateDOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element root = doc.createElement("catalog");
            doc.appendChild(root);

            Element book = doc.createElement("book");
            root.appendChild(book);
            book.setTextContent("Book 1");
            book.setAttribute("title", "the lord of the rings 1");
            Element author_1 = doc.createElement("author");
            author_1.setTextContent("Author 1");
            book.appendChild(author_1);

            Element book2 = doc.createElement("book");
            root.appendChild(book2);
            book2.setTextContent("Book 2");
            book2.setAttribute("title", "the lord of the rings 2");
            Element author_2 = doc.createElement("author");
            author_2.setTextContent("Author 2");
            book2.appendChild(author_2);

            Element book3 = doc.createElement("book");
            root.appendChild(book3);
            book3.setTextContent("Book 3");
            book3.setAttribute("title", "the lord of the rings 3");
            Element author_3 = doc.createElement("author");
            author_3.setTextContent("Author 3");
            book3.appendChild(author_3);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();

            DOMSource doms = new DOMSource(doc);
            StreamResult sr = new StreamResult(new File("C:\\Users\\Nickolas\\IdeaProjects\\" +
                    "untitled666\\src\\java_professional\\lesson_notes\\eleventh_lesson\\dom_create\\create.xml"));
            t.transform(doms, sr);
        } catch (ParserConfigurationException | TransformerException e) { // | SAXException | IOException
            e.printStackTrace();
        }
    }
}
