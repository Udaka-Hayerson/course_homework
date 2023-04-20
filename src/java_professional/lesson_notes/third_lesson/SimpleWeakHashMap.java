package java_professional.lesson_notes.third_lesson;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class SimpleWeakHashMap {
    public static void main(String[] args) {
        Map<String, String> weakHashMap = new WeakHashMap<>();
        Map<String, String> hashMap = new HashMap<>();
        String keyWeakHashMap = new String("keyWeakHashMap");
        String keyHashMap = new String("keyHashMap");
        weakHashMap.put(keyWeakHashMap, "weekHash");
        hashMap.put(keyHashMap, "Hash");
        System.out.println("Before gc " + weakHashMap.get("keyWeakHashMap") + " " + hashMap.get("keyHashMap"));
        keyWeakHashMap = null;
        keyHashMap = null;
        System.gc();
        System.out.println("After gc " + weakHashMap.get("keyWeakHashMap") + " " + hashMap.get("keyHashMap"));


        Integer str_ref = 1; // strong reference
        SoftReference<Integer> softReference = new SoftReference<>(str_ref); // soft reference
        WeakReference<Integer> weakReference = new WeakReference<>(str_ref); // weak reference
        PhantomReference<Integer> phantomReference = new PhantomReference<>(str_ref, new ReferenceQueue<>()); // phantom reference
    }
}
