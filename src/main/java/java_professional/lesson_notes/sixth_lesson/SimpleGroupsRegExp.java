package java_professional.lesson_notes.sixth_lesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class SimpleGroupsRegExp {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("(.(.(.(.))))");
        Matcher m = p.matcher("Java");
        System.out.println(m.groupCount());
        System.out.println(m.find());
        for (int i = 0; i <= m.groupCount(); i++) {
            System.out.println(i + " = " + m.group(i));
        }

        // quantifiers - квантифікатори
        myMatches("([a-z]*)([a-z]+)", "abcdxyz");
        myMatches("([a-z]?)([a-z]+)", "abcdxyz");
        myMatches("([a-z]+)([a-z]*)", "abcdxyz");
        myMatches("([a-z]?)([a-z]?)", "abcdxyz");

    }
    public static void myMatches(String regex , String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            System.out.println("First group " + matcher.group(1));
            System.out.println("Second group " + matcher.group(2));
        } else {
            System.out.println("Nothing . No matches .");
        }
        System.out.println();
    }
}
