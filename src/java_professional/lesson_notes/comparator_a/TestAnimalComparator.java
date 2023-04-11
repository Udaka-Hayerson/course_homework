package java_professional.lesson_notes.comparator_a;

import java.util.Arrays;
import java.util.Comparator;

public class TestAnimalComparator {
    public static void main(String[] args) {

        Animal cat = new Animal("Maverick", 10, 30, 500);
        Animal dog = new Animal("Maverick", 30, 40, 1000);
        Animal monkey = new Animal("Gorilla", 130, 25, 80000);
        Animal lion = new Animal("Lion", 100, 50, 100000);
        Animal bird = new Animal("Crow", 1, 100, 200);


        Animal[] animals = {cat, dog, monkey, lion, bird};
        Arrays.sort(animals, new ComparatorByPrice());
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println();
        Arrays.sort(animals, new ComparatorBySpeed());
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println();
        Arrays.sort(animals, new ComparatorByWeight());
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println();
        Arrays.sort(animals, new ComparatorByBreed());
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println();



        Animal[] a_with_anonymous_comparator = {cat, dog, monkey, lion, bird};
        Arrays.sort(a_with_anonymous_comparator, new Comparator<Animal>() {
            public int compare(Animal a1, Animal a2) {
                return a1.price - a2.price;
            }
        });
        for (Animal animal : a_with_anonymous_comparator) {
            System.out.println(animal);
        }
        System.out.println();
        Arrays.sort(a_with_anonymous_comparator, new Comparator<Animal>() {
            public int compare(Animal a1, Animal a2) {
                return a1.speed - a2.speed;
            }
        });
        for (Animal animal : a_with_anonymous_comparator) {
            System.out.println(animal);
        }
        System.out.println();
        Arrays.sort(a_with_anonymous_comparator, new Comparator<Animal>() {
            public int compare(Animal a1, Animal a2) {
                return a1.weight - a2.weight;
            }
        });
        for (Animal animal : a_with_anonymous_comparator) {
            System.out.println(animal);
        }
        System.out.println();
        Arrays.sort(a_with_anonymous_comparator, new Comparator<Animal>() {
            public int compare(Animal a1, Animal a2) {
                return a1.breed.compareTo(a2.breed);
            }
        });
        for (Animal animal : a_with_anonymous_comparator) {
            System.out.println(animal);
        }
        System.out.println();



        Animal[] a_with_lambda = {cat, dog, monkey, lion, bird};
        Arrays.sort(a_with_lambda, (a1, a2) -> a1.price - a2.price);
        for (Animal animal : a_with_lambda) {
            System.out.println(animal);
        }
        System.out.println();
        Arrays.sort(a_with_lambda, (a1, a2) -> a1.speed - a2.speed);
        for (Animal animal : a_with_lambda) {
            System.out.println(animal);
        }
        System.out.println();
        Arrays.sort(a_with_lambda, (a1, a2) -> a1.weight - a2.weight);
        for (Animal animal : a_with_lambda) {
            System.out.println(animal);
        }
        System.out.println();
        Arrays.sort(a_with_lambda, (a1, a2) -> a1.breed.compareTo(a2.breed));
        for (Animal animal : a_with_lambda) {
            System.out.println(animal);
        }
        System.out.println();

    }
}
