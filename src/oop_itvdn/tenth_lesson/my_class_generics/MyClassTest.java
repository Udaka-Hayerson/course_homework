package oop_itvdn.tenth_lesson.my_class_generics;

public class MyClassTest {
    public static void main(String[] args) throws Exception {

        Object o = MyClass.fabric(MyClass.class);
        System.out.println(o.getClass());
//        MyClass<String> mc = new MyClass<>();
//        Object inner = mc.fabric();

    }
}
