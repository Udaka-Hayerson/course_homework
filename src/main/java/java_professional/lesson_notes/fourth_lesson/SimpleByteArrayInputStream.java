package java_professional.lesson_notes.fourth_lesson;

import java.io.ByteArrayInputStream;

public class SimpleByteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr = new byte[]{1, 6, 2, 8, 5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        int tmp;
        while ((tmp = byteArrayInputStream.read()) != -1){
            System.out.print(tmp + " ");
        }
        String str = "23.04.21 - Happy Birthday Andy";
        byte[] s_arr = str.getBytes();
        ByteArrayInputStream byteArrayInputStream_s = new ByteArrayInputStream(s_arr, s_arr.length-19, 19);
        while ((tmp = byteArrayInputStream_s.read()) != -1){
            System.out.print(tmp + " ");
        }
    }
}
