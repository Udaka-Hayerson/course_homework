package oop_itvdn.secondlesson.carone;

//        Используя Intelij IDEA создать проект, пакет.
//        Создать класс Машина с полями год(int), цвет(String).
//        Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
//        Создать класс Main в котором создать экземпляры вызывая разные конструкторы

public class Car {
    private int year;
    private String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
