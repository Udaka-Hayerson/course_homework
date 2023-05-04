package jvastartitvdn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class NumbersCheck {

    static void greater_or_less_than_zero(double a){
        if (a > 0)
            System.out.println("Больше нуля");
        else if (a < 0)
            System.out.println("Меньше нуля");
        else
            System.out.println("Равно нулю");
    }

    static void prime_number(double a){
        for (int i = 2; i < a; i++) {
            if (((a != i) && (a % i == 0)) || (a == 1)) {
                System.out.println("not prime number");
                break;
            }
        }
    }


    static void is_divisible_by_2_5_3_6_9(double a){
        int[]array = new int[]{2, 5, 3, 6, 9};
        for(int i : array){
            if (a % i == 0)
                System.out.println("" + a + " делится на " + i);
            else
                System.out.println("" + a + "NOT делится на " + i);

        }
    }





    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваше число");
        String sa = reader.readLine();
        double a = Double.parseDouble(sa);

        greater_or_less_than_zero(a);
        prime_number(a);
        is_divisible_by_2_5_3_6_9(a);



    }
}
