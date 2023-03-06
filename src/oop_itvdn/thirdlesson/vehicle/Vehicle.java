package oop_itvdn.thirdlesson.vehicle;

//Создать класс Vehicle.
//В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
//выпуска).
//Создайте 3 производных класса Plane, Саг и Ship.
//Для класса Plane должна быть определена высота и количество пассажиров.
//Для класса Ship – количество пассажиров и порт приписки.
//Написать программу, которая выводит на экран информацию о каждом средстве передвижения.

public class Vehicle {
    private double price;
    private double speed;
    private int year_release;

    public Vehicle(double price, double speed, int year_release) {
        this.price = price;
        this.speed = speed;
        this.year_release = year_release;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getYear_release() {
        return year_release;
    }

    public void setYear_release(int year_release) {
        this.year_release = year_release;
    }

    public void printVehicle(){
        System.out.println(this.getPrice());
        System.out.println(this.getSpeed());
        System.out.println(this.getYear_release());

    }

}
