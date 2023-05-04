package java_professional.lesson_notes.ninth_lesson;

import java.io.*;

class Car implements Serializable {

    private int price;
    private String brand;
    private String model;
    private Engine engine;



    public Car(int price, String brand, String model,Engine engine ) {
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "price=" + price + ", brand='" + brand + '\'' + ", model='" + model + ", engine='" + engine ;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}

class Engine implements Serializable{
    private int power;
    public Engine() {
    }
    public Engine(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    @Override
    public String toString() {
        return "Engine{" + "power=" + power + '}';
    }
}

public class SimpleSerializable {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Nickolas\\IdeaProjects\\untitled666\\src\\java_professional\\lesson_notes\\ninth_lesson\\car_file.txt");
        Car c =new Car(23000, "BMW", "F10", new Engine(500));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            oos.writeObject(c);
            Car car = (Car) ois.readObject();
            System.out.println(car.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
