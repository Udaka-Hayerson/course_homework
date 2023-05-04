package oop_itvdn.sixth_lesson.vehicle;

//Требуется:
//Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door, которые
//также должны содержать метод print. Создайте экземпляры классов Wheel и Door.

class Vehicle {

    static void print(){
        System.out.println("Print Vehicle");
    }

    class Wheel {
        void print(){
            System.out.println("Print Wheel");
        }
    }

    class Door {
        void print(){
            System.out.println("Print Door");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();
        Vehicle.print();
        wheel.print();
        door.print();
    }
}
