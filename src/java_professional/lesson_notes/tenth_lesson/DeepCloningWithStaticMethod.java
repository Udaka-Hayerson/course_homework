package java_professional.lesson_notes.tenth_lesson;

class Racer{
    private int age;
    private String name;

    public Racer() {
    }

    public static Racer getRecerInstance(int age, String name) {
        Racer racer = new Racer();
        racer.age = age;
        racer.name = name;
        return racer;
    }

    @Override
    public String toString() {
        return "Recer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Car{
    private  int weight;
    private  int power;

    public Car(){}

    public Car(int weight, int power) {
        this.weight = weight;
        this.power = power;
    }

    public static Car getCarInstance(Car c) {
        Car car = new Car();
        car.weight = c.weight;
        car.power = c.power;
        return car;
    }

    public static Car getCarConstrInstance(Car c) {
        Car car = new Car(c.weight, c.power);
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", power=" + power +
                '}';
    }
}
public class DeepCloningWithStaticMethod {
    public static void main(String[] args) {
        Racer racerInstance = Racer.getRecerInstance(33, "Bullet");
        Car car = new Car(1200, 770);
        Car carInstance = Car.getCarInstance(car);
        Car car_c_i = Car.getCarConstrInstance(car);
        System.out.println(racerInstance);
        System.out.println(carInstance);
        System.out.println(car_c_i);
    }
}
