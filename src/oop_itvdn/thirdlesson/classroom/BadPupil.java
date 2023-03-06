package oop_itvdn.thirdlesson.classroom;

public class BadPupil extends Pupil{

    @Override
    void study(){
        System.out.println("He is never studying.");
    }

    @Override
    void read(){
        System.out.println("He is never reading.");
    }

    @Override
    void write(){
        System.out.println("He is never writing.");
    }

    @Override
    void relax(){
        System.out.println("He is always relaxing.");
    }
}
