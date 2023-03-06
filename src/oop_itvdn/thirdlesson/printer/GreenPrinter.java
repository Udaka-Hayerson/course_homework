package oop_itvdn.thirdlesson.printer;

public class GreenPrinter extends Printer{

    @Override
    public void print(String value){
        System.out.println((char)27+"[32m"+value);
    }
}
