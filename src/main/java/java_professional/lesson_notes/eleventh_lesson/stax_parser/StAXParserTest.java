package java_professional.lesson_notes.eleventh_lesson.stax_parser;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class StAXParserTest {
    public static void main(String[] args) throws XMLStreamException {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter(System.out);
        writer.writeStartDocument("1.0");
        writer.writeStartElement("catalog");
        writer.writeStartElement("book");
        writer.writeStartElement("author");
        writer.writeCharacters("Mykola");

        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument();

        writer.flush();
        writer.close();

    }
}
