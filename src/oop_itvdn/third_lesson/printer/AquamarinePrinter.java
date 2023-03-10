package oop_itvdn.third_lesson.printer;

public class AquamarinePrinter extends Printer{

    @Override
    public void print(String value){
        System.out.println((char)27+"[36m"+value);
    }
}
