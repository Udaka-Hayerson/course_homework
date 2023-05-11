package java_start_itvdn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortingArray {

    public static int[] fillArray() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length");
        int length = Integer.parseInt(reader.readLine());
        int[] arr = new int[length];
        for (int i = 0; i <= length -1; i++) {
            System.out.println("Enter " + i + " index of array");
            arr[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] sortingArray(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
//                if(j == arr.length - 1)
//                    break;
                if (arr[j] > arr[j + 1]) {
                    int swipe = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swipe;

                }

            }

        }
        return arr;
    }

    public static void main(String[] args) throws Exception{
        int [] arr = fillArray();
        int [] new_arr = sortingArray(arr);
        System.out.println(Arrays.toString(arr));
        }

    }
