package java_professional.lesson_notes.fourteenth_lesson.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadCounter[] threadCounters = new ThreadCounter[100];
        fiilingThreadArray(counter, threadCounters);
        startingThreadsOfArray(threadCounters);
        joiningThreadsOfArray(threadCounters);

        System.out.println(counter.getCounter());
    }

    private static void joiningThreadsOfArray(ThreadCounter[] threadCounters){
        for (ThreadCounter threadCounter : threadCounters) {
            try {
                threadCounter.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void startingThreadsOfArray(ThreadCounter[] threadCounters) {
        for (ThreadCounter threadCounter : threadCounters) {
            threadCounter.start();
        }
    }

    private static void fiilingThreadArray(Counter counter, ThreadCounter[] threadCounters) {
        for (int i = 0; i < threadCounters.length; i++) {
            threadCounters[i] = new ThreadCounter(counter, 1000);
        }
    }
}

class Counter {
    private long counter = 0;
    private Lock reentrantLock = new ReentrantLock();

    public void incrementCurrentValue() {
        this.reentrantLock.lock();
        try {
            counter++;
        } finally {
            this.reentrantLock.unlock();

        }
    }

    public long getCounter() {
        return counter;
    }
}

class ThreadCounter extends Thread {
    private Counter counter;
    private int number;

    public ThreadCounter(Counter counter, int number) {
        this.counter = counter;
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            counter.incrementCurrentValue();
        }
    }
}

