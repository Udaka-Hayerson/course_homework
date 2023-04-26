package java_professional.lesson_notes.sixth_lesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegex {
    public static void main(String[] args) {

        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)?";
        String s ="Адреса ел пошти : firstmail@mail.ru.mail і secondmail@gmail.com";
        Pattern patt = Pattern.compile(regex);
        Matcher matcher = patt.matcher(s);
        while (matcher.find()) {
            System.out.println("mail : " + matcher.group()); // matcher.group()
            // mail : firstmail@mail.ru.mail  -
            // mail : secondmail@gmail.com
        }
        Pattern patt2 = Pattern.compile(regex);
        Matcher matcher2 = patt2.matcher(s);
        while (matcher2.find()) {
            System.out.println("mail : " + matcher2);  //  matcher
            // mail : java.util.regex.Matcher[pattern=(\w+)@(\w+\.)(\w+)(\.\w+)? region=0,63 lastmatch=firstmail@mail.ru.mail]
            // mail : java.util.regex.Matcher[pattern=(\w+)@(\w+\.)(\w+)(\.\w+)? region=0,63 lastmatch=secondmail@gmail.com]
        }

        Pattern ptt = Pattern.compile("\\d+\\s?");
        String [] word = ptt.split("java11language3for88everyone");
        for(String w : word) {
            System.out.print(" " + w);
        }

        Pattern p = Pattern.compile("[a-zA-Z]+\\s*[a-zA-Z]+\\s*[a-zA-Z]+");  // ("regex");
        Matcher m = p.matcher("Hello crazy World");  // ("text");
        System.out.println(m.matches());

        Pattern p1 = Pattern.compile("[a-z&&[^g]]+",  Pattern.CASE_INSENSITIVE);
        Matcher m1 = p1.matcher("aBcdfJ");
        System.out.println(m1.matches());

        Pattern p2 = Pattern.compile("[а-яА-яіІєЄїЇґҐ',]+\\s*[а-яА-яіІєЄїЇґҐ']+", Pattern.UNICODE_CASE|Pattern.CASE_INSENSITIVE);
        Matcher m2 = p2.matcher("Мар'яна, підґрунтя");
        System.out.println(m2.matches());

        Pattern p3 = Pattern.compile("[а-яієїґ,']+\\s*[а-яієїґ,']+", Pattern.UNICODE_CASE|Pattern.CASE_INSENSITIVE);
        Matcher m3 = p2.matcher("Мар'яна, Підґрунтя");
        System.out.println(m3.matches());
    }
}
