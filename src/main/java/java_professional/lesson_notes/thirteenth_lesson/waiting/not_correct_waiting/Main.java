package java_professional.lesson_notes.thirteenth_lesson.waiting.not_correct_waiting;
// EXAMPLE CORRECT BUSINESS LOGIC
class Product {
    int id;
    boolean isProduced;

    synchronized void getIdProduct() {
        if(!isProduced){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get" + this.id);
        isProduced = false;
        notify();
    }

    synchronized void setIdProduct(int id) {
        if(isProduced){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.id = id;
        System.out.println("Set" + this.id);
        isProduced = true;
        notify();
    }
}
class Producer extends Thread{
    Product p;
    int count;

    public Producer(Product p, int count) {
        this.p = p;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i < count; i++) {
            p.setIdProduct(i);
        }
    }
}
class Consumer extends Thread{
    Product p;
    int count;

    public Consumer(Product p, int count) {
        this.p = p;
        this.count = count;
    }
        @Override
    public void run() {
            for (int i = 1; i < count + 1; i++) {
                p.getIdProduct();
            }
    }
}
public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        Producer pr = new Producer(p, 5);
        Consumer cons = new Consumer(p, 5);
        pr.start();
        cons.start();

    }
}
