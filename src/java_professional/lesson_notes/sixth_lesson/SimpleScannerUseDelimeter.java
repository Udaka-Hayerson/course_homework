package java_professional.lesson_notes.sixth_lesson;

import java.util.Scanner;

public class SimpleScannerUseDelimeter {
    public static void main(String[] args) {
        String ss = "Java 1 Java 2 Java 3 Java 4";
        Scanner sc = new Scanner(ss).useDelimiter("\\s*Java\\s*");
        while (sc.hasNextInt()){
            System.out.println(sc.nextInt());
        }
    }
}
