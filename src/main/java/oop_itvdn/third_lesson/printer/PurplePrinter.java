package oop_itvdn.third_lesson.printer;

public class PurplePrinter extends Printer{

    @Override
    public void print(String value){
        System.out.println((char)27+"[35m"+value);
    }
}
