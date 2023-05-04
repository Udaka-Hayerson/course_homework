package java_professional.lesson_notes.fourth_lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SimpleErr {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("D:");
            System.out.println("file opened");
        } catch (FileNotFoundException e) {
            System.err.println("file opening failed");
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }
    }
}
