package oop_itvdn.thirdlesson.vehicle;


import oop_itvdn.thirdlesson.printer.Printer;

public class Main {
    public static void main(String[] args) {

        Vehicle plane = new Plane(1500000.5, 1600.9, 2018,6,12);
        Vehicle car = new CarExt(2500.5, 220.5, 2020);
        Vehicle ship = new Ship(60000.2, 20.1, 1999, 30, "New York");
        Vehicle vehicle = new Vehicle(3000.2, 100.9, 1991);

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = plane;
        vehicles[1] = car;
        vehicles[2] = ship;
        vehicles[3] = vehicle;

        for ( Vehicle i : vehicles) {
            System.out.println(i);
            i.printVehicle();
        }
    }
}

