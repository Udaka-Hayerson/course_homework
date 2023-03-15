package oop_itvdn.seventh_lesson.vehicles;

//Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать
//целочисленное значение (стоимость автомобиля), содержать метод getColor(), который возвращает
//строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать
//строку с названием экземпляра, цветом и стоимостью автомобиля.

public class ClassVehicles {
    public static void main(String[] args) {
        Vehicles vehicle1 = Vehicles.MERCEDES;
        Vehicles vehicle2 = Vehicles.BMW;
        Vehicles vehicle3 = Vehicles.AUDI;

        System.out.println(vehicle1.toString(vehicle1));
        System.out.println(vehicle2.toString(vehicle2));
        System.out.println(vehicle3.toString(vehicle3));
    }

}
enum Vehicles{
    MERCEDES("Black", 30000), BMW("White", 40000), AUDI("Grey", 50000);
    String color;
    int price;

    Vehicles(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String toString(Vehicles vehicles){
        return " " + vehicles + " " + vehicles.getColor() + " " + vehicles.getPrice();
    }
}
