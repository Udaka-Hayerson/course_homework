package oop_itvdn.second_lesson.carthree;

public class Main {

    public static void main(String[] args) {
        Car car_31 = new Car();
        Car car_32 = new Car(9);
        Car car_33 = new Car(12, 190.5);
        Car car_34 = new Car(21, 180.5, 2500);
        Car car_35 = new Car(101, 40.5, 1100, "green");

        System.out.println(car_31);
        System.out.println(car_32);
        System.out.println(car_33);
        System.out.println(car_34);
        System.out.println(car_35);
    }
}
