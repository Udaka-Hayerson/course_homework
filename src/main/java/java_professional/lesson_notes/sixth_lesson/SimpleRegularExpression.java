package java_professional.lesson_notes.sixth_lesson;

import java.util.Scanner;

public class SimpleRegularExpression {
    public static void main(String[] args) {
        String ss = "whefunwgv mm . jijnvr. mm. ijipvr. jwopj. mm whoi. oiapev,'w,,wr;. mm nmops. nuie hhhdgdf mm j. beuiwgbu. mm jnvu. hhhfff";
        String[] arr = ss.split("\\."); // regex
        for (String s : arr) {
            System.out.println(s);
        }
        Scanner sc = new Scanner(ss);
        while (sc.hasNext()){
            if (sc.hasNext("mm")) {   // pattern
                System.out.println(sc.next());
            } else {
                System.out.println();
                sc.next();
            }
        }
    }
}
