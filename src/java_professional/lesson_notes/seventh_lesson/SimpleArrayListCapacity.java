package java_professional.lesson_notes.seventh_lesson;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class SimpleArrayListCapacity {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>();
//        System.out.println(getCapacity(arrayList));
    }
/*  Unable to make field transient java.lang.Object[] java.util.ArrayList.elementData accessible:
    module java.base does not "opens java.util" to unnamed module @7ef20235
    public static int getCapacity(ArrayList<?> al) throws NoSuchFieldException, IllegalAccessException  {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[])field.get(al)).length;
    }*/
}
