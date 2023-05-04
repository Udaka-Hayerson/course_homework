package oop_itvdn.sixth_lesson.distance_converter;

//Требуется:
//Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
//статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
//измерения (к примеру, из метров в километры, из километров в мили, и так далее).
// centimeter. meter. kilometer. mile. yard  foot inch from_meters_to_centimeters

public class Distance {

    private double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    void print(){
        System.out.println(this.distance);
    }

    public static void main(String[] args) {
        double millimeters = 5000000.0;
        double kilometers = millimeters / Distance.Converter.from_kilometers_to_millimeters(1.0);
        double miles = millimeters / Distance.Converter.from_miles_to_millimeters(1.0);  // можна і Distance.Converter і Converter. ....
        double yards = 2653.9;
        double from_yards_to_meter = (Converter.from_inches_to_millimeters(Converter.from_foots_to_inches(Converter.from_yards_to_foots(yards))))
                / Converter.from_centimeters_to_millimeters(Converter.from_meters_to_centimeters(1.0));

        Distance distance_k = new Distance(kilometers);
        Distance distance_m = new Distance(miles);
        Distance distance_mtr = new Distance(from_yards_to_meter);

        distance_k.print();
        distance_m.print();
        distance_mtr.print();

    }

    static class Converter {

        static double from_centimeters_to_millimeters(double centimeter){return centimeter * 10;}
        static double from_meters_to_centimeters(double meter){return meter * 100;}
        static double from_kilometers_to_meters(double kilometer){return kilometer * 1000;}
        static double from_kilometers_to_millimeters(double kilometer){return from_centimeters_to_millimeters(from_meters_to_centimeters(from_kilometers_to_meters(kilometer)));}



        static double from_inches_to_millimeters(double inch){return inch * 25.4;}
        static double from_foots_to_inches(double foot){return foot * 12;}
        static double from_yards_to_foots(double yards){return yards * 3;}
        static double from_miles_to_yards(double mile){return mile * 1760;}
        static double from_miles_to_millimeters(double mile){return from_inches_to_millimeters(from_foots_to_inches(from_yards_to_foots(from_miles_to_yards(mile))));}
    }
}
