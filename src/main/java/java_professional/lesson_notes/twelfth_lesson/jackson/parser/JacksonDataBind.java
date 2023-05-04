package java_professional.lesson_notes.twelfth_lesson.jackson.parser;

//import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java_professional.lesson_notes.twelfth_lesson.jackson.entity.Person;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {
    public static void parseJSON(String path) {
        ObjectMapper mapper = new ObjectMapper();
        Person person = null;
        try {
            person = mapper.readValue(new File(path), Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(person);

    }
}
