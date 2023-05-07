package java_professional.lesson_notes.fourteenth_lesson.interrupt;

public class InterruptTest extends Thread{
    private int counter;
    private String word;
    private Thread thread;

    public InterruptTest(int counter, String word) {
        this.counter = counter;
        this.word = word;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        while (!interrupted()) {
            thread.interrupt();
            for (int i = 0; i < counter; i++) {
                System.out.println(word + i);
                /*
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        }
    }

    public static void main(String[] args) {
        InterruptTest it1 = new InterruptTest(5, "Did");
        InterruptTest it2 = new InterruptTest(5, "Did Not");
        it1.setThread(it2);
        it2.setThread(it1);
        it1.setName("Second Thread");
        it2.setName("First Thread");
        it1.start();
        it2.start();
    }
}
