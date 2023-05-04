package java_professional.lesson_notes.second_lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimpleArrayList {
    static ArrayList <String> s_arr = new ArrayList<>();

    public static void main(String[] args) throws Exception{
//        extractedClassCastException(); // ClassCastException
        extractedA();
        extractedB();
        extractedRevers();



    }

    private static void extractedRevers() throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s_arr.add("A");
        s_arr.add("B");
        s_arr.add("C");
        s_arr.add("D");
        s_arr.add("E");
//        for (int i = 0; i < 5; i++) {
//            s_arr.add(reader.readLine());
//        }

        for (int i = 0; i < 5; i++) {
            String swipe = s_arr.remove(s_arr.size() - 1);
            s_arr.add(0, swipe); // у лектора працювало у мене ні
        }
        for (String s : s_arr) {
            System.out.print(s + " ");

        }
    }

    private static void extractedB() {
        ArrayList <Integer>al = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            al.add(i);

        }
        for (Integer integer : al) {
            System.out.print(integer + " ");

        }
        System.out.println("\n" + al.size());
        for (int i = 0; i < 50; i++) {
            al.remove(0);

        }
        for (Integer integer : al) {
            System.out.print(integer + " ");

        }
        System.out.println("\n" + al.size());
        al.trimToSize();

    }

    private static void extractedA() {
        ArrayList <Integer>al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(0, 1); // здвиг всіх елементів вправо
        for (Integer integer : al) {
            System.out.println(integer);

        }
    }

    private static void extractedClassCastException() {
        ArrayList list = new ArrayList(); // не варто використовувати RAW type
        list.add("Simple");
        list.add(25);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add((Integer) (list.get(0))); // ClassCastException  -  ось чому не варто використовувати RAW type
        System.out.println(list.get(0));
    }
}
