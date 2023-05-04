package java_professional.lesson_notes.eleventh_lesson.dom_parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class TestXMLParserDOM {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Nickolas\\IdeaProjects\\" +
                    "untitled666\\src\\java_professional\\lesson_notes\\eleventh_lesson\\dom_parser\\test_2.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            Element root = doc.getDocumentElement();
            System.out.println("Root element " + root.getNodeName());
            System.out.println("-------------------------");
            NodeList nl =  root.getChildNodes();
            for (int i = 0; i < nl.getLength(); i++) {
                Node node = nl.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) node;
                    System.out.println("BOOK: ");
                    System.out.println("Author: " + e.getElementsByTagName("author").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Title: " + e.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("----------------------------");
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
