package jvastartitvdn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ReversedArray {

    static ArrayList<Integer> myReverse(int[]array){
        ArrayList<Integer> rev_array = new ArrayList<Integer>();
        for (int i = array.length - 1; i > -1; i--) {
            rev_array.add(array[i]);

        }
        return rev_array;
    }

    static ArrayList<Integer> subArray(int[]sub_args, int[]array){
        int index = sub_args[0];
        int count = sub_args[1];
        ArrayList<Integer> sub_array = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            if(i + index > array.length - 1){
                sub_array.add(1);
            }
            else{
                sub_array.add(array[i + index]);
            }
            
        }
        return sub_array;
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

        int[] data = new int[]{user_length, user_min, user_max};
        return data;
    }

    static int[] enterSubData() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Method returns part of the array received as an argument, \n" +
                "starting from the position specified in the index argument,\n" +
                "dimension that corresponds to the value of the count argument.");
        System.out.println("Enter index: ");
        String s_index = reader.readLine();
        int index = Integer.parseInt(s_index);

        System.out.println("Enter count: ");
        String s_count = reader.readLine();
        int count = Integer.parseInt(s_count);


        int[] data = new int[]{index, count};
        return data;
    }

    public static void main(String[] args) throws Exception{
        ArrayList<Integer> user_array_list = new ArrayList<Integer>();
        user_array_list = fillArray(enterData());
        //int[] array = new int[user_array_list.size()];
        int[] array = user_array_list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(subArray(enterSubData(), array));
        System.out.println(myReverse(array));

    }
}
