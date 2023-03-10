package oop_itvdn.third_lesson.printer;

public class Main {
    public static void main(String[] args) {
        String value = "Hayerson";
        Printer red_printer = new RedPrinter();
        Printer green_printer = new GreenPrinter();
        Printer yellow_printer = new YellowPrinter();
        Printer blue_printer = new BluePrinter();
        Printer purple_printer = new PurplePrinter();
        Printer aquamarine_printer = new AquamarinePrinter();
        Printer grey_printer = new GreyPrinter();
        Printer [] printers = new Printer[7];
        printers[0] = red_printer;
        printers[1] = green_printer;
        printers[2] = yellow_printer;
        printers[3] = blue_printer;
        printers[4] = purple_printer;
        printers[5] = aquamarine_printer;
        printers[6] = grey_printer;

        for ( Printer i : printers) {
            i.print(value);
            System.out.println(i);

        }
    }
}
