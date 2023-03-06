package oop_itvdn.thirdlesson.classroom;

public class Pupil {
    void study(){
        System.out.println("He is sometimes studying.");
    }

    void read(){
        System.out.println("He is sometimes reading.");
    }

    void write(){
        System.out.println("He is sometimes writing.");
    }

    void relax(){
        System.out.println("He is sometimes relaxing.");
    }

    void info(){
        this.study();
        this.read();
        this.write();
        this.relax();
    }


}
