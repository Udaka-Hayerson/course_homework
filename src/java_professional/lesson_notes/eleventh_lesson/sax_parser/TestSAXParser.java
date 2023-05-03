package java_professional.lesson_notes.eleventh_lesson.sax_parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class TestSAXParser {
    public static void main(String[] args) {
        final String filename = "C:\\Users\\Nickolas\\IdeaProjects\\" +
                "untitled666\\src\\java_professional\\lesson_notes\\eleventh_lesson\\phonebook.xml";
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxp = spf.newSAXParser();
            DefaultHandler dh = new DefaultHandler(){
                boolean name = false;
                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if(qName.equalsIgnoreCase("name")){
                        name = true;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if(name){
                        System.out.println("Name: " + new String(ch, start, length));
                        name = false;
                    }
                }

            };
            saxp.parse(filename, dh);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
