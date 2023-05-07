package java_professional.lesson_notes.fourteenth_lesson.synch_deadlock;

public class Main {
    public static void main(String[] args) {
        // SYNCHRONIZED DEADLOCK
        SinpleThread1 sinpleThread1 = new SinpleThread1();
        SinpleThread2 sinpleThread2 = new SinpleThread2();
        sinpleThread1.start();
        sinpleThread2.start();
    }
    private static class SinpleThread1 extends Thread{
        @Override
        public void run() {
            synchronized (SinpleThread1.class){
                System.out.println("Thread 1 Hold SimpleTherad1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 waiting SimpleThrad2");
                synchronized (SinpleThread2.class){
                    System.out.println("Thread 1 Hold SimpleTherad1 and SimpleThrad2");
                }
            }
        }
    }
    private static class SinpleThread2 extends Thread{
        @Override
        public void run() {
            synchronized (SinpleThread2.class){
                System.out.println("Thread 1 Hold SimpleTherad2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 waiting SimpleThrad2");
                synchronized (SinpleThread1.class){
                    System.out.println("Thread 2 Hold SimpleTherad1 and SimpleThrad2");
                }
            }
        }
    }
}
