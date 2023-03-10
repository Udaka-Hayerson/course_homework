package oop_itvdn.third_lesson.classroom;

public class ExcellentPupil extends Pupil{

    @Override
    void study(){
        System.out.println("He is always studying.");
    }

    @Override
    void read(){
        System.out.println("He is always reading.");
    }

    @Override
    void write(){
        System.out.println("He is always writing.");
    }

    @Override
    void relax(){
        System.out.println("He is never relaxing.");
    }
}
