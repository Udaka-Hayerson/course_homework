package oop_itvdn.eighth_lesson.calculator;

//Задание
//Создайте проект, используя IntelliJ IDEA.
//Создайте класс Calculator.
//В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание,
//mul – умножение, div – деление).
//Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
//исключение.
//Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При
//возникновении ошибок должны выбрасываться исключения.


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {

    public double multiplication(double a, double b){return a * b;}

    public double division(double a, double b) throws Exception{
        // TODO: Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать исключение
        return a / b;
    }
    public double addition(double a, double b){return a + b;}

    public double subtraction(double a, double b){return a - b;}


    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number");
        String sa = reader.readLine();
        double a = Double.parseDouble(sa);

        System.out.println("Enter the second number");
        String sb = reader.readLine();
        double b = Double.parseDouble(sb);

        System.out.println("Enter the second number");
        String user_answer = reader.readLine();

        Calculator calculator = new Calculator();

        if (user_answer.equalsIgnoreCase("*")) {

            System.out.println(calculator.multiplication(a, b));
        } else if (user_answer.equalsIgnoreCase("/")){
            calculator.multiplication(a, b);
            System.out.println(calculator.division(a, b));
        } else if (user_answer.equalsIgnoreCase("+")){
            System.out.println(calculator.addition(a, b));
        } else if (user_answer.equalsIgnoreCase("-")){
            System.out.println(calculator.subtraction(a, b));
        } else {
            System.out.println("Wrong Answer");
        }
    }
}
