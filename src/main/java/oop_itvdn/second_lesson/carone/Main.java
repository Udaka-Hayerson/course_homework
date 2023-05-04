package oop_itvdn.second_lesson.carone;

public class Main {


    public static void main(String[] args) {

        Car car_11 = new Car();
        Car car_12 = new Car(7);
        Car car_13 = new Car(9, "white");

        System.out.println(car_11);
        System.out.println(car_12);
        System.out.println(car_13);
    }
}
