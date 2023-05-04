package java_professional.lesson_notes.thirteenth_lesson.synchronization_package.with_synchronization;

public class Cashier extends Thread{
    int id;
    Ticket[] tickets;

    public Cashier(){}
    public Cashier(int id, Ticket[] tickets) {
        this.id = id;
        this.tickets = tickets;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < tickets.length; i++) {
            tickets[i].buy(this);
        }
    }
/*  business logic not correct
    public synchronized void run() {
        for (int i = 0; i < tickets.length; i++) {
            if(!tickets[i].isBought){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tickets[i].isBought = true;
                System.out.println("Cashier " + id + " ticket " + tickets[i].place);
            }
        }
    }*/
}
