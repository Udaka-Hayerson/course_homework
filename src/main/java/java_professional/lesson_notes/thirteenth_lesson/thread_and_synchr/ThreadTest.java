package java_professional.lesson_notes.thirteenth_lesson.thread_and_synchr;

import java.util.ArrayList;

public class ThreadTest extends Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new ThreadTest());
        thread.start();
        ThreadTest.extracted();
        Thread thread_t = new Thread(new ThreadTest());
        thread_t.start();

    }

    private static void extracted() {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 100000; i++) {
            al.add(new Object());
            if(i == 99999){
                System.out.println("Hello Thread");
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Thread " + Thread.currentThread().getName());
        }
    }
}
/*
main
Hello Thread
0 Thread Thread-3
1 Thread Thread-3
2 Thread Thread-3
3 Thread Thread-3
0 Thread Thread-1
4 Thread Thread-3
1 Thread Thread-1
5 Thread Thread-3
2 Thread Thread-1
6 Thread Thread-3
3 Thread Thread-1
7 Thread Thread-3
8 Thread Thread-3
4 Thread Thread-1
9 Thread Thread-3
5 Thread Thread-1
6 Thread Thread-1
7 Thread Thread-1
8 Thread Thread-1
9 Thread Thread-1
*/
