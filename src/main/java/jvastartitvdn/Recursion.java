package jvastartitvdn;

public class Recursion {

    static void complexRecursion(int counter) {
        counter--;
        System.out.println("A: " + counter);
        if (counter!=0)
            method(counter);
        System.out.println("B: " + counter);

    }

    static void method(int counter) {
        System.out.println("X: " + counter);
        complexRecursion(counter);
        System.out.println("Y: " + counter);
    }



    public static void recursion(int counter) {
        counter--;
        System.out.println("A: " + counter);
        if (counter != 0)
            recursion(counter);
        System.out.println("B: " + counter);

    }
    public static void main(String[] args) {
        recursion(3);
        complexRecursion(3);
    }
}
