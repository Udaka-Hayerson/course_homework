package java_professional.lesson_notes.fifth_lesson;

import java.util.Locale;

public class SimpleString {
    public static void main(String[] args) {
        String str = "hi"; // literal
        String new_str = new String("hi"); // new
        char [] arr = {'h', 'i'};
        String arr_str = new String(arr);
        String arr_str_param = new String(arr, 0, 2);
        String conc = str.concat(new_str);
        String two_conc = conc.concat(str).concat(new_str);
        String two_conc_new = conc.concat(str).concat(new_str);
        long t1 = System.nanoTime();
        String race = two_conc.concat(two_conc_new);
        long t2 = System.nanoTime();
        System.out.println(race + " time concat = " + (t2 - t1));
        long t3 = System.nanoTime();
        String race2 = two_conc + two_conc_new;
        long t4 = System.nanoTime();
        System.out.println(race2 + " time concat = " + (t4 - t3));

        System.out.println(arr_str);
        System.out.println(arr_str_param);
        System.out.println(conc);
        System.out.println(two_conc_new.substring(1, 5));
        System.out.println(two_conc_new.substring(5));
        System.out.println(two_conc_new.indexOf('i'));
        System.out.println(Long.toString(t4));
        System.out.println(two_conc_new.replace('h', 'i'));

        System.out.println();
        System.out.println(two_conc.equalsIgnoreCase(two_conc_new.toUpperCase(Locale.ROOT)));
        System.out.println(str.startsWith("h"));
        System.out.println(str.endsWith("i"));
        System.out.println(two_conc.regionMatches(4, two_conc_new, 4, 4));
        Boolean b = true;
        boolean d = false;

    }
}










