package java_start_itvdn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Calculator {
    public static double [] group = new double[3];


    static double[] calculate(double a, double b, double c){
        a /= 5.0;
        b /= 5.0;
        c /= 5.0;
        group[0] = a;
        group[1] = b;
        group[2] = c;
        return group;
    }

    static double calculate(double a){
        a /= 5.0;;
        return a;
    }

    public static void recursionCalculate() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число для деления на пять или букву N/n/not для выхода");
        String str_rec_a = reader.readLine();
        if((str_rec_a.equals("N"))||(str_rec_a.equals("n"))||(str_rec_a.equals("not"))) {
            System.out.println("Exit");
        }
        else {
            double rec_a = Double.parseDouble(str_rec_a);
            System.out.println(rec_a/5.0);
            recursionCalculate();
        }

    }

    public static void main(String[] args) throws Exception{

        recursionCalculate();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число");
        String sa = reader.readLine();
        double a = Double.parseDouble(sa);

        System.out.println("Введите второе число");
        String sb = reader.readLine();
        double b = Double.parseDouble(sb);

        System.out.println("Введите третье число");
        String sc = reader.readLine();
        double c = Double.parseDouble(sc);

        double []result = calculate(a, b, c);
        System.out.println(Arrays.toString(result));

        boolean bool = true;
        while (bool) {
            System.out.println("Введите число для деления на пять или букву N/n/not для выхода");
            String str_a = reader.readLine();
            if((str_a.equals("N"))||(str_a.equals("n"))||(str_a.equals("not"))) {
                bool = false;
                break;
            }
            double d_a = Double.parseDouble(str_a);
            System.out.println(calculate(d_a));

        }


    }
}
