package java_start_itvdn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rectangle {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the width rectangle");
        String s_width = reader.readLine();
        int width = Integer.parseInt(s_width);
        System.out.println("Enter the height rectangle");
        String s_height = reader.readLine();
        int height = Integer.parseInt(s_height);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("E");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if((i == 0 )||( i == height-1)) {
                    System.out.print("* ");
                } else if((j == 0 )||( j == width-1)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println("E");
        int w_h = 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < w_h; j++) {
                System.out.print("* ");
            }
            if(w_h < width)
                w_h++;
            System.out.println();
        }

        System.out.println("E");

        int copy_width = width;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < copy_width; j++) {
                System.out.print("* ");
            }
            copy_width--;
            System.out.println();
        }


        System.out.println("E");
        int w_n = 1;


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < w_n; j++) {
                if((i == 0 )||( i == height-1)) {
                    System.out.print("* ");
                } else if((j == 0 )||( j == w_n-1)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            if(w_n < width)
                w_n++;
            System.out.println();
        }

        System.out.println("E");

        copy_width = width;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < copy_width; j++) {
                if((i == 0 )||( i == height-1)) {
                    System.out.print("* ");
                } else if((j == 0 )||( j == copy_width-1)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            copy_width--;
            System.out.println();
        }

        System.out.println("E");

    }

}














