package oop_itvdn.firstlesson.rectangle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the width rectangle");
        double width = Double.parseDouble(reader.readLine());
        System.out.println("Enter the height rectangle");
        double height = Double.parseDouble(reader.readLine());

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.perimeterCalculator(rectangle.side1, rectangle.side2));
        System.out.println(rectangle.areaCalculator(rectangle.side1, rectangle.side2));

    }

}
