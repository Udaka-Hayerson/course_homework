package java_professional.lesson_notes.twelfth_lesson.gson.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java_professional.lesson_notes.twelfth_lesson.gson.entity.CurrencyRate;


import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {
    public static void parseGson(String url) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
        CurrencyRate[] currencyRates = gson.fromJson(jsonReader, CurrencyRate[].class);
        for (CurrencyRate currencyRate : currencyRates) {
            System.out.println(currencyRate);
        }
        String jsonString = gson.toJson(currencyRates);
        Files.write(Paths.get("C:\\Users\\Nickolas\\IdeaProjects\\untitled666\\src\\main\\resources\\rates.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
