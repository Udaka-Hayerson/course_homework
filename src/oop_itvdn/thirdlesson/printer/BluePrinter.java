package oop_itvdn.thirdlesson.printer;

public class BluePrinter extends Printer{

    @Override
    public void print(String value){
        System.out.println((char)27+"[34m"+value);
    }
}
