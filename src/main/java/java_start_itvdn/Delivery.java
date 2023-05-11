package java_start_itvdn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Delivery {

//    static int factorial(int value) {
//        if(value == 0 || value == 1) return 1;
//        int fact = value * (value - 1);
//        if(value != 1) factorial(--value);
//        return fact;
//    }

    static int factorial(int n) {
        int result;
        if (n == 0 || n == 1)
            return 1;
        result = factorial(n - 1) * n;
        return result;
    }

    static int cycleFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Keep the number of delivery recipients, and the program will calculate the number of delivery options.");
        String sa = reader.readLine();
        int a = Integer.parseInt(sa);
        //System.out.println(factorial(a));
        System.out.println(factorial(a));
        System.out.println(cycleFactorial(a));


    }
}
