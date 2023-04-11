package java_professional.lesson_notes.comparator_a;

import java.util.Comparator;

public class Animal {
    String breed;
    int weight;
    int speed;
    int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}

class ComparatorByPrice implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {
        return a1.price - a2.price;
    }
}
class ComparatorBySpeed implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {
        return a1.speed - a2.speed;
    }
}
class ComparatorByWeight implements Comparator<Animal>  {
    public int compare(Animal a1, Animal a2) {
        return a1.weight - a2.weight;
    }
}
class ComparatorByBreed implements Comparator<Animal>  {
    public int compare(Animal a1, Animal a2) {
        return a1.breed.compareTo(a2.breed);
    }
}

