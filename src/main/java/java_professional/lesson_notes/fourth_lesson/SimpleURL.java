package java_professional.lesson_notes.fourth_lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleURL {
    public static void main(String[] args) throws MalformedURLException {
        BufferedReader reader;
        String s;

        URL nbuApi = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange");
        try {
            reader = new BufferedReader(new InputStreamReader(nbuApi.openStream()));

            while ((s = reader.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
