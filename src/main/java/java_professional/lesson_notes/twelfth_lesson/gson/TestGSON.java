package java_professional.lesson_notes.twelfth_lesson.gson;

import java_professional.lesson_notes.twelfth_lesson.gson.parser.GsonParser;

import java.io.IOException;

public class TestGSON {
    public static void main(String[] args) throws IOException {
        GsonParser.parseGson("https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=11");
    }
}
