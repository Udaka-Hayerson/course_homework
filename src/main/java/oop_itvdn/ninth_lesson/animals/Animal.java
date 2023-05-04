package oop_itvdn.ninth_lesson.animals;

//Задание 1
//Создать класс Animal с именем String, возрастом int, хвостом Boolean. В классе переопределить метод
//toString, что бы вывод был сдедующим
//«Имя: Васька, возраст: 45, хвост: нет».
//В классе Animal переопределить методы equals & hashCode.

public class Animal {
    String name;
    int age;
    boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        String yes_no;
        if(this.isTail()) yes_no = "yes"; else yes_no = "no";
//      return "Name: " + this.getName() + ", Age: " + this.getAge() + ", Tail: " + yes_no;
        return String.format("Name: %s, Age: %d, Tail: %s", this.getName(), this.getAge(), yes_no);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        if (name != animal.name || age != animal.age || tail != animal.tail) return false;
        else return true;
    }

    @Override
    public  int hashCode(){
        System.out.print("hashCode: ");
        return super.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

}

