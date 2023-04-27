package oop_itvdn.tenth_lesson.my_class_generics;

public class MyClassTest {
    public static void main(String[] args) throws Exception {

        Object o = MyClass.fabric(MyClass.class);
        System.out.println(o.getClass());

//        MyClassGen<Integer> cls = new MyClassGen<>();
//        Integer s = cls.genFabric();
//        System.out.println(s);
//        String s = new String(MyClassGen.f);
//        MyClass<String> mc = new MyClass<>();
//        Object inner = mc.fabric();

    }
}
