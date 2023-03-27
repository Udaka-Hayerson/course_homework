package oop_itvdn.ninth_lesson.animals;

public class AnimalTest{
    public static void main(String[] args) {
        Animal animal0 = new Animal("Lion", 9, true);
        Animal animal1 = new Animal("Dog", 7, true);
        Animal animal2 = new Animal("Dog", 7, true);
        System.out.println(animal0);
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal0.equals(animal1));
        System.out.println(animal1.equals(animal2));
        System.out.println(animal0.hashCode());
        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
    }
}