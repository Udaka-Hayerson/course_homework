package java_professional.lesson_notes.thirteenth_lesson.thread_and_synchr;
class OtherThread extends Thread {
    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            try {
                Thread.sleep(2000);
                System.out.println("j = " + j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class SinpleThread {
    public static void main(String[] args) throws InterruptedException {
        // Статический метод currentThread() инкапсулирует текущий поток в этот объект
        Thread myThread = Thread.currentThread();
        // Узнаем имя потока
        System.out.println("Name of Thread: " + myThread.getName());
        // Изменяем имя потока
        myThread.setName("MyThread");
        System.out.println("Thread name: " + myThread.getName());
        // Узнаем приоритет потока, по умолчанию 5 у та1п
        System.out.println("Priority: " + myThread.getPriority());
        // Изменяем приоритет потока от 0...10
        myThread.setPriority(10);
        System.out.println("Priority: " + myThread.getPriority());
        // Проверяем, жив ли поток
        System.out.println("Is Thread Alive?: " + myThread.isAlive());
        // Какой поток выполнится первым - не известно
        Thread other = new Thread(new OtherThread());
        other.start();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("i = " + i);
            if(i == 5) other.join();
        }
    }
}
