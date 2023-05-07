package java_professional.lesson_notes.fourteenth_lesson.deadlock;

public class Main {
    public static void main(String[] args) {
        // DEADLOCK
        MyThreadOne mt1 = new MyThreadOne();
        MyThreadTwo mt2 = new MyThreadTwo();
        mt1.setThread1(mt2);
        mt2.setThread2(mt1);
        mt1.start();
        mt2.start();
    }
}
