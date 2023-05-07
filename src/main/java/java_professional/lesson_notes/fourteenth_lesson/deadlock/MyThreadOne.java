package java_professional.lesson_notes.fourteenth_lesson.deadlock;

public class MyThreadOne extends Thread{
    private Thread t1;

    MyThreadOne(){
        System.out.println("MyThreadOne create");
    }

    public void setThread1(Thread t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        System.out.println("MyThreadOne run");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadOne interrapt MyThreadTwo finish");
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadOne finish");
    }
}
