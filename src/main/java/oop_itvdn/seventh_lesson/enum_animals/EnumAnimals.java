package oop_itvdn.seventh_lesson.enum_animals;

////Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
////целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
////должен возвращать название экземпляра и возраст животного.

public class EnumAnimals {
    public static void main(String[] args) {
        Animals anim = Animals.Rhinoceros;
        System.out.println(anim.toString(anim));

        Animals anim1 = Animals.Buffalo;
        System.out.println(anim1.toString(anim1));

        Animals anim2 = Animals.Elephant;
        System.out.println(anim2.toString(anim2));
    }
}
enum Animals{
    Rhinoceros(10), Buffalo(15), Elephant(30);
    int age;

    Animals(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString(Animals animals){
        return " " + animals + " " + animals.getAge();
    }
}

