package oop_itvdn.tenth_lesson.my_class_generics;

//Задание 1
//Создайте проект, используя IntelliJ IDEA.
//Создайте класс MyClass<T>, содержащий статический фабричный метод - T factoryMethod(), который
//будет порождать экземпляры типа, указанного в качестве параметра типа (указателя места заполнения
//типом – Т).

//Cannot Create Instances of Type Parameters BUT .....

import java.util.Arrays;

public class MyClass <T>{
    private T generics;
    public MyClass(T generics) {
        this.generics = generics;
    }

    public T fabric() throws Exception {
        Class<?> cls = generics.getClass();
        Object elem = cls.getDeclaredConstructor().newInstance(); // OK
        return (T) elem;
    }
}
