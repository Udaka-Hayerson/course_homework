package java_professional.lesson_notes.twelfth_lesson.jackson_url;

import java_professional.lesson_notes.twelfth_lesson.jackson_url.parser.JacksonURLParser;

import java.io.IOException;

public class TestURLJackson {
    public static void main(String[] args) throws IOException {
        JacksonURLParser.parseJackson("https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=11");
    }
}
