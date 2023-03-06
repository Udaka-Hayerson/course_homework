package jvastartitvdn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arithmetics {

    static int mul(int a, int  b){
        return a * b;
    }

    static double div(int a, int  b){
        return (double)a / (double)b;
    }

    static int add(int a, int  b){
        return a + b;
    }

    static int sub(int a, int  b){
        return a - b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите знак операции над числами т.е. * , / , + , - : ");
        String operand = reader.readLine();

        System.out.println("Введите первое число");
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);

        System.out.println("Введите второе число");
        String sb = reader.readLine();
        int b = Integer.parseInt(sb);

        if (operand.equals("*"))
            System.out.println(mul(a, b));
        else if ((operand.equals("/")) && (b != 0))
            System.out.println(div(a, b));
        else if (operand.equals("+"))
            System.out.println(add(a, b));
        else if (operand.equals("-"))
            System.out.println(sub(a, b));
        else
            System.out.println("Вы ввели неправельный знак операции над числами");



    }
}
