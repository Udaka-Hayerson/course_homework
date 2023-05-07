package java_professional.lesson_notes.fourteenth_lesson.daemon;

public class Main {
    public static void main(String[] args) {
        Daemon daemon1 = new Daemon();
        Daemon daemon2 = new Daemon();
        daemon1.setDaemon(true);
        daemon1.start();
        daemon2.start();
    }
}
class Daemon extends Thread {
    @Override
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("Daemon thread starts");
                sleep(1000);
            } else {
                System.out.println("User thread starts");
                sleep(1000); //if sleep(10) daemon th. dead when user th. dead
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(!isDaemon()){
                System.out.println("User thread dead");
            } else {
                System.out.println("Daemon thread dead");
            }
        }
    }
}