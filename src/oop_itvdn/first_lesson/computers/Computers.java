package oop_itvdn.first_lesson.computers;

//Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов
//Computers размером 5. Далее руками создать 5 экземпляров этого класса и записать в компьютер
//(используя loop)

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Computers {
    public String name;

    public Computers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void show (){
        System.out.println(name);
    }

    public static void main(String[] args) throws Exception{
        Computers [] comp_array = new Computers[5];

        System.out.println(comp_array[0]);
        System.out.println(comp_array[1]);
        System.out.println(comp_array[2]);
        System.out.println(comp_array[3]);
        System.out.println(comp_array[4]);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String name = reader.readLine();
            comp_array[i] = new Computers(name);

        }

        System.out.println(comp_array[0]);
        System.out.println(comp_array[1]);
        System.out.println(comp_array[2]);
        System.out.println(comp_array[3]);
        System.out.println(comp_array[4]);

        for (Computers i : comp_array) {
            i.show();

        }
    }
}
