package oop_itvdn.third_lesson.printer;

public class GreyPrinter extends Printer{

    @Override
    public void print(String value){
        System.out.println((char)27+"[37m"+value);
    }
}
