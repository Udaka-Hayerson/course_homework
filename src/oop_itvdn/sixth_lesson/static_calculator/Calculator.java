package oop_itvdn.sixth_lesson.static_calculator;

//Задание
//Используя IntelliJ IDEA, создайте проект.
//Требуется:
//Создать класс Calculator, с методами для выполнения основных арифметических операций.
//Написать программу, которая выводит на экран основные арифметические операции.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws Exception{


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number");
        String sa = reader.readLine();
        double a = Double.parseDouble(sa);

        System.out.println("Enter the second number");
        String sb = reader.readLine();
        double b = Double.parseDouble(sb);

        System.out.println(StaticCalculator.multiplication(a, b));
        System.out.println(StaticCalculator.division(a, b));
        System.out.println(StaticCalculator.addition(a, b));
        System.out.println(StaticCalculator.subtraction(a, b));

    }

    static class StaticCalculator {

        static double multiplication(double a, double b){return a * b;}
        static double division(double a, double b){return a / b;}
        static double addition(double a, double b){return a + b;}
        static double subtraction(double a, double b){return a - b;}

    }
}
