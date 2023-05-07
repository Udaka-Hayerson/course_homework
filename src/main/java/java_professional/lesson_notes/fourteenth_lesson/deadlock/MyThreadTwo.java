package java_professional.lesson_notes.fourteenth_lesson.deadlock;

public class MyThreadTwo extends Thread{
    private Thread t2;

    MyThreadTwo(){
        System.out.println("MyThreadTwo create");
    }

    public void setThread2(Thread t2) {
        this.t2 = t2;
    }

    @Override
    public void run() {
        System.out.println("MyThreadTwo run");
        System.out.println("MyThreadTwo interrapt MyThreadOne finish");
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadOne finish");
    }
}
