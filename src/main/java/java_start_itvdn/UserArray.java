package java_start_itvdn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class UserArray {

    static int[] incrementArrayByArgument(int[]in_array, int argument){
        int[]out_array = new int[in_array.length+1];
        for (int i = 0; i < out_array.length; i++) {
            if(i < in_array.length){
                out_array[i] = in_array[i];
            }
            else {
                out_array[i] = argument;
            }

        }
        return out_array;
    }

    static ArrayList<Integer> fillArray(int[]enter_data){
        int user_length = enter_data[0];
        int min = enter_data[1];
        int max = enter_data[2];

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < user_length; i++) {
            max -= min;
            int item = (int) (Math.random() * ++max) + min;
            arr.add(item);
        }
        return arr;
    }

    static int[] enterData() throws Exception{
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

//        int[] data = new int[]{user_length, user_min, user_max};
        return new int[]{user_length, user_min, user_max};
    }

    static int enterIncrementArgument() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the argument by which you want to increase the array");
        System.out.println("Enter argument: ");

        String s_argument = reader.readLine();
//        int argument = Integer.parseInt(s_argument);
        return Integer.parseInt(s_argument);
    }


    public static void main(String[] args) throws Exception{

        ArrayList<Integer> user_array_list;
        user_array_list = fillArray(enterData());
        int[] array = user_array_list.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(incrementArrayByArgument(array, enterIncrementArgument())));

        System.out.println(Arrays.toString(incrementArrayByArgument(fillArray(enterData()).stream().mapToInt(i -> i).toArray(), enterIncrementArgument())));

    }
}
