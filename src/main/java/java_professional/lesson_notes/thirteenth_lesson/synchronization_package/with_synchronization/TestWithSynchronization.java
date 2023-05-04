package java_professional.lesson_notes.thirteenth_lesson.synchronization_package.with_synchronization;

public class TestWithSynchronization {
    public static void main(String[] args) {
        Ticket[] t = {
                new Ticket(10),
                new Ticket(20),
                new Ticket(30),
                new Ticket(40)
        };
        Cashier c1 = new Cashier(1, t);
        Cashier c2 = new Cashier(2, t);
        Cashier c3 = new Cashier(3, t);
        Cashier c4 = new Cashier(4, t);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
/*
the work of cashiers.run() with synchronized is not correct
Cashier 2 ticket 10
Cashier 1 ticket 10
Cashier 4 ticket 10
Cashier 3 ticket 10
Cashier 5 ticket 10
Cashier 2 ticket 20
Cashier 5 ticket 20
Cashier 1 ticket 20
Cashier 3 ticket 20
Cashier 2 ticket 30
Cashier 4 ticket 20
Cashier 5 ticket 40
Cashier 3 ticket 40
Cashier 2 ticket 40
Cashier 4 ticket 40
Cashier 1 ticket 40
Cashier 3 ticket 50
Cashier 4 ticket 50
Cashier 2 ticket 50
Cashier 1 ticket 50
Cashier 5 ticket 50
*/