package oop_itvdn.thirdlesson.printer;

public class RedPrinter extends Printer{

    @Override
    public void print(String value){
        System.out.println((char)27+"[31m"+value);
    }
}
