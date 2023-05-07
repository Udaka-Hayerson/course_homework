package java_professional.lesson_notes.fourteenth_lesson.interrupt;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter.interrupt();
    }
}

class Counter extends Thread{
    @Override
    public void run() {
        int i = 0;

        while (!isInterrupted()) {
            System.out.println("i = " + i++);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
