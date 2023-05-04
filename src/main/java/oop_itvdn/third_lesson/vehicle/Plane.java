package oop_itvdn.third_lesson.vehicle;

public class Plane extends Vehicle{
    private  int height;
    private int number_of_passengers;

    public Plane(double price, double speed, int year_release, int height, int number_of_passengers) {
        super(price, speed, year_release);
        this.height = height;
        this.number_of_passengers = number_of_passengers;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumber_of_passengers() {
        return number_of_passengers;
    }

    public void setNumber_of_passengers(int number_of_passengers) {
        this.number_of_passengers = number_of_passengers;
    }

    @Override
    public void printVehicle(){
        System.out.println(super.getPrice());
        System.out.println(super.getSpeed());
        System.out.println(super.getYear_release());
        System.out.println(this.getHeight());
        System.out.println(this.getNumber_of_passengers());

    }
}
