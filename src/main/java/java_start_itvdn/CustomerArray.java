package java_start_itvdn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomerArray {

    static int minValue(int[]arr){
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }

    static int maxValue(int[]arr){
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;

    }

    static int sumArray(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static double arithmeticMean(int[]arr, int user_length){
        double arithmetic_mean = (sumArray(arr))/user_length;
        return arithmetic_mean;
    }

    static ArrayList<Integer> evenNumbersOrOddNumbers(int[]arr){
        ArrayList<Integer> cus_array = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                cus_array.add(arr[i]);
            }
        }
        return cus_array;
    }

    static int[] fillArray(int[]arr , int user_length , int min, int max){
        arr = new int[user_length];
        for (int i = 0; i < user_length; i++) {
            max -= min;
            int item = (int) (Math.random() * ++max) + min;
            arr[i] = item;
        }
        return arr;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the length of the array and also a significant function from min to max");
        System.out.println("length of the array: ");
        String s_length = reader.readLine();
        int user_length = Integer.parseInt(s_length);

        System.out.println("min : ");
        String s_min = reader.readLine();
        int user_min = Integer.parseInt(s_min);

        System.out.println("max : ");
        String s_max = reader.readLine();
        int user_max = Integer.parseInt(s_max);

        int[] user_array = new int[user_length];
        user_array = fillArray(user_array, user_length, user_min, user_max);

        System.out.println(Arrays.toString(user_array));
        System.out.println(minValue(user_array));
        System.out.println(maxValue(user_array));
        System.out.println(sumArray(user_array));
        System.out.println(arithmeticMean(user_array, user_length));
        System.out.println(evenNumbersOrOddNumbers(user_array));

//generics

    }
}
