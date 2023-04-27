package oop_itvdn.tenth_lesson.my_class_generics;

//Задание 1
//Создайте проект, используя IntelliJ IDEA.
//Создайте класс MyClass<T>, содержащий статический фабричный метод - T factoryMethod(), который
//будет порождать экземпляры типа, указанного в качестве параметра типа (указателя места заполнения
//типом – Т).

//Cannot Create Instances of Type Parameters

import java.lang.reflect.Field;

public class MyClass {
    public static <T> T fabric(Class<T> cls) throws Exception {
        T elem = cls.getDeclaredConstructor().newInstance(); // OK
        return elem;
    }
}

//class MyClassGen<T> {
//    T field = (T) new Object();
//
//    public T genFabric() throws NoSuchFieldException {
//        Object o = new Object(); // OK
//        return (T) o;
//    }
//}
//public class MyClass<T> {
//    class Inner extends T {
//        public Inner() {
//            super();
//        }
//    }
//
//    public Object fabric() throws Exception {
//        Inner inner = new Inner(); // OK
//        return inner;
//    }
//}
//    public static class Util {
//        public static <T> T getValue() {
//            Object obj = new Object();
//            try {
//                obj = (T) obj;
//                throw new ClassCastException("Incorrect Cast");
//            } catch (ClassCastException e){
//                System.out.println(e.getMessage());
//                return (T) new Object();
//            }
//            return (T) obj;
//        }

//    } public static void main(String []args) {
//        List list = Arrays.asList("Author", "Book");
//        for (Object element : list) {
//            String data = Util.getValue(element, String.class);
//            System.out.println(data);
//            System.out.println(Util.<String>getValue(element));
//        }
//public class MyClass{
//    public static <T> T getValue(Object obj) { return (T) obj; }
//}
//    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
//        return Arrays.stream(a)
//                .map(mapperFunction)
//                .collect(Collectors.toList());
//    }
//    public <T> factoryMethod(Class<T> tClass){
//        tClass.newInstance();
//    }
//    public static Integer factoryMethod<E>(E obj){
////        if(obj instanceof Integer){
////            return new Integer(9);
////        };
//    }
//    static <T> factoryMethod(){
//        return (T)new Object();
//    }
//    class Inner extends T{
//
//    }
//
//     public static Inner factoryMethod() {
//       return new Inner();
//    }
//}
//class  TTT {
//    public static void main(String[] args) {
//        MyClass.fromArrayToList<String, Integer>();
//    }
//}
