package java_professional.lesson_notes.ninth_lesson;

import java.io.*;

class CarParent{
    public CarParent() {
        System.out.println("parent constructor");
    }

    @Override
    public String toString() {
        return "CarParent{}";
    }
}
public class BMW extends CarParent implements Serializable {
    private int power;

    public BMW(int power) {
        this.power = power;
        System.out.println("child constructor");
    }

    public BMW() {
        super();
        System.out.println("child constructor");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {return "BMW{" + "power=" + power + '}'; }


}
class testBMW{
    public static void main(String[] args) {
        BMW bmw = new BMW(500);
        File file = new File("C:\\Users\\Nickolas\\IdeaProjects\\untitled666\\src\\java_professional\\lesson_notes\\ninth_lesson\\bmw_file.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            oos.writeObject(bmw);
            BMW car = (BMW) ois.readObject();
            System.out.println(car.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}