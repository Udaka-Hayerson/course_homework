package java_professional.lesson_notes.twelfth_lesson.jackson_url.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.stream.JsonReader;
import java_professional.lesson_notes.twelfth_lesson.jackson_url.entity.CurrencyRate;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonURLParser {
    public static void parseJackson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
        CurrencyRate[] currencyRates = objectMapper.readValue(new URL(url), CurrencyRate[].class);
        for (CurrencyRate currencyRate : currencyRates) {
            System.out.println(currencyRate);
        }
        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(currencyRates);
        Files.write(Paths.get("C:\\Users\\Nickolas\\IdeaProjects\\untitled666\\src\\main\\resources\\rates_j.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
