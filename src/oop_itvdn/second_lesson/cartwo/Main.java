package oop_itvdn.second_lesson.cartwo;

public class Main {

    public static void main(String[] args) {
        Car car_21 = new Car();
        Car car_22 = new Car(50);
        Car car_23 = new Car(50, 150.5);
        Car car_24 = new Car(50, 150.5, 2500);
        Car car_25 = new Car(50, 150.5, 2500, "black");

        System.out.println(car_21);
        System.out.println(car_22);
        System.out.println(car_23);
        System.out.println(car_24);
        System.out.println(car_25);
    }
}
