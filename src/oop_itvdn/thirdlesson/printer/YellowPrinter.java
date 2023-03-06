package oop_itvdn.thirdlesson.printer;

public class YellowPrinter extends Printer{

    @Override
    public void print(String value){
        System.out.println((char)27+"[33m"+value);
    }
}
