package java_start_itvdn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conversion {
    static double conversion(double x, double y){
        return x * y;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите вашу сумму в валюте");
        String sa = reader.readLine();
        double a = Double.parseDouble(sa);

        System.out.println("Введите курс валюты как дробь известная/искомая");
        String sb = reader.readLine();
        double b = Double.parseDouble(sb);

        System.out.println(conversion(a, b));

    }
}
