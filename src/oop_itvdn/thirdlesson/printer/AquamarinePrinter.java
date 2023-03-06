package oop_itvdn.thirdlesson.printer;

public class AquamarinePrinter extends Printer{

    @Override
    public void print(String value){
        System.out.println((char)27+"[36m"+value);
    }
}
