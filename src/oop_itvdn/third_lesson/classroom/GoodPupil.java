package oop_itvdn.third_lesson.classroom;

public class GoodPupil extends Pupil{

    @Override
    void study(){
        System.out.println("He is often studying.");
    }

    @Override
    void read(){
        System.out.println("He is often reading.");
    }

    @Override
    void write(){
        System.out.println("He is often writing.");
    }

    @Override
    void relax(){
        System.out.println("He is sometimes relaxing.");
    }
}
