package java_professional.lesson_notes.eleventh_lesson.xml_parser;

import java.io.UnsupportedEncodingException;

public class TestXMLparser {

    public static void main(String[] args) throws UnsupportedEncodingException {
        XMLParser xml = new XMLParser("C:\\Users\\Nickolas\\IdeaProjects\\untitled666\\src\\" +
                "java_professional\\lesson_notes\\eleventh_lesson\\test.xml");
        String value = xml.get("catalog/book/author");
        System.out.println(value) ;
    }
}