package java_professional.lesson_notes.sixth_lesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegexTelephone {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\+[1-9]\\d{2}\\(\\d{2}\\)(\\d{2}-){2}\\d{3}");
        Matcher m = p.matcher("+380(66)66-66-666");
        boolean b = m.matches();
        System.out.println(b);
    }
}
