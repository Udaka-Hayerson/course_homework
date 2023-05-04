package java_professional.lesson_notes.thirteenth_lesson.thread_and_synchr;

import java.util.ArrayList;

public class RunnableThreadTest implements Runnable{

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new RunnableThreadTest());
        thread.start();
        RunnableThreadTest.extracted();
        Thread thread_t = new Thread(new RunnableThreadTest());
        thread_t.start();

    }

    private static void extracted() {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 100000; i++) {
            al.add(new Object());
            if(i == 99999){ System.out.println("Hello Thread");}
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Thread " + Thread.currentThread().getName());
        }
    }
}
