package java_professional.lesson_notes.thirteenth_lesson.synchronization_package.with_synchronization;

public class Ticket {
    boolean isBought;
    int place;

    public Ticket() {
    }

    public Ticket(int place) {
        this.place = place;
    }

    void buy(Cashier c) {
        synchronized(this) {
            if (!isBought) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                isBought = true;
                System.out.println("Cashier " + c.id + " ticket " + this.place);
            }
        }
    }
}
