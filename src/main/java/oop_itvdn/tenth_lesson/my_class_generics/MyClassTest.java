package oop_itvdn.tenth_lesson.my_class_generics;

import java.util.ArrayList;

public class MyClassTest {
    public static void main(String[] args) throws Exception {
        int obj_count = 10;
        MyClass<String> myClass = new MyClass<>("gen");
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < obj_count; i++) {
            al.add(myClass.fabric());
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        MyClass<Integer> myClass2 = new MyClass<>(666);
        ArrayList<String> al2 = new ArrayList<>();
        for (int i = 0; i < obj_count; i++) {
            al.add(myClass.fabric());
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
