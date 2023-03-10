package oop_itvdn.third_lesson.vehicle;

public class Ship extends Vehicle{
    private int number_of_passengers;
    private String home_port;

    public Ship(double price, double speed, int year_release,int number_of_passengers, String home_port) {
        super(price, speed, year_release);
        this.number_of_passengers = number_of_passengers;
        this.home_port = home_port;
    }

    public int getNumber_of_passengers() {
        return number_of_passengers;
    }

    public void setNumber_of_passengers(int number_of_passengers) {
        this.number_of_passengers = number_of_passengers;
    }

    public String getHome_port() {
        return home_port;
    }

    public void setHome_port(String home_port) {
        this.home_port = home_port;
    }

    @Override
    public void printVehicle(){
        System.out.println(super.getPrice());
        System.out.println(super.getSpeed());
        System.out.println(super.getYear_release());
        System.out.println(this.getNumber_of_passengers());
        System.out.println(this.getHome_port());

    }
}
