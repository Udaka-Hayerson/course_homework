package oop_itvdn.tenth_lesson.my_list_generics;

//Задание 2
//Создайте проект, используя IntelliJ IDEA.
//Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его
//экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс взаимодействия с
//экземпляром, должен включать метод добавления элемента, индексатор для получения значения
//элемента по указанному индексу и свойство только для чтения для получения общего количества
//элементов.

import java.util.*;
import java.util.List;

public class MyList <T> extends ArrayList implements List {


//    public static final int   MY_MIN_VALUE = 0x80000000;
//    public static final int   MY_MAX_VALUE = 0x7fffffff;
//    public static final int MY_SOFT_MAX_ARRAY_LENGTH = MY_MAX_VALUE - 8;// = 2147483639;
//    private static final int MY_DEFAULT_CAPACITY = 10;
//    private static final Object[] MY_EMPTY_ELEMENT_DATA = {};
//    private static final Object[] MY_DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA = {};
//    transient Object[] myElementData;
//    private int my_size;
//
//
//    public myList(int initialCapacity) {
//        if (initialCapacity > 0) {
//            this.myElementData = new Object[initialCapacity];
//        } else if (initialCapacity == 0) {
//            this.myElementData = MY_EMPTY_ELEMENT_DATA;
//        } else {
//            throw new IllegalArgumentException("Illegal Capacity: "+
//                    initialCapacity);
//        }
//    }
//
//    public MyList() {
//        this.myElementData = MY_DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA;
//    }
//
//    public MyList(Collection<? extends T> c) {
//        Object[] a = c.toArray();
//        if ((my_size = a.length) != 0) {
//            if (c.getClass() == ArrayList.class) {
//                myElementData = a;
//            } else {
//                myElementData = Arrays.copyOf(a, my_size, Object[].class);
//            }
//        } else {
//            // replace with empty array.
//            myElementData = MY_EMPTY_ELEMENT_DATA;
//        }
//    }
//
//    public int my_size() {
//        return my_size;
//    }
//
//    public int myIndexOf(Object o) {
//        return myIndexOfRange(o, 0, my_size);
//    }
//
//    int myIndexOfRange(Object o, int start, int end) {
//        Object[] es = myElementData;
//        if (o == null) {
//            for (int i = start; i < end; i++) {
//                if (es[i] == null) {
//                    return i;
//                }
//            }
//        } else {
//            for (int i = start; i < end; i++) {
//                if (o.equals(es[i])) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//
//    T myElementData(int index) {
//        return (T) myElementData[index];
//    }
//
//    public T get(int index) {
//        Objects.checkIndex(index, my_size);
//        return myElementData(index);
//    }
//
//    private void add(T t, Object[] elementData, int s) {
//        if (s == elementData.length)
//            elementData = grow();
//        elementData[s] = t;
//        my_size = s + 1;
//    }
//
//    public static int myNewLength(int oldLength, int minGrowth, int prefGrowth) {
//        // preconditions not checked because of inlining
//        // assert oldLength >= 0
//        // assert minGrowth > 0
//
//        int prefLength = oldLength + Math.max(minGrowth, prefGrowth); // might overflow
//        if (0 < prefLength && prefLength <= MY_SOFT_MAX_ARRAY_LENGTH) {
//            return prefLength;
//        } else {
//            // put code cold in a separate method
//            return hugeLength(oldLength, minGrowth);
//        }
//    }
//
//    private static int hugeLength(int oldLength, int minGrowth) {
//        int minLength = oldLength + minGrowth;
//        if (minLength < 0) { // overflow
//            throw new OutOfMemoryError(
//                    "Required array length " + oldLength + " + " + minGrowth + " is too large");
//        } else if (minLength <= MY_SOFT_MAX_ARRAY_LENGTH) {
//            return MY_SOFT_MAX_ARRAY_LENGTH;
//        } else {
//            return minLength;
//        }
//    }
//
//    private Object[] grow() {
//        return grow(my_size + 1);
//    }
//
//    private Object[] grow(int minCapacity) {
//        int oldCapacity = myElementData.length;
//        if (oldCapacity > 0 || myElementData != MY_DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA) {
//            int newCapacity = myNewLength(oldCapacity,
//                    minCapacity - oldCapacity, /* minimum growth */
//                    oldCapacity >> 1           /* preferred growth */);
//            return myElementData = Arrays.copyOf(myElementData, newCapacity);
//        } else {
//            return myElementData = new Object[Math.max(MY_DEFAULT_CAPACITY, minCapacity)];
//        }
//    }
//
//    private void myAdd(T e, Object[] elementData, int s) {
//        if (s == elementData.length)
//            elementData = grow();
//        elementData[s] = e;
//        my_size = s + 1;
//    }
//
//    public boolean myAdd(T e) {
//        modCount++;
//        add(e, myElementData, my_size);
//        return true;
//    }
//
//    public void myAdd(int index, T element) throws Exception {
//        myRangeCheckForAdd(index);
//        modCount++;
//        final int s;
//        Object[] elementData;
//        if ((s = my_size) == (elementData = this.myElementData).length)
//            elementData = grow();
//        System.arraycopy(elementData, index,
//                elementData, index + 1,
//                s - index);
//        elementData[index] = element;
//        my_size = s + 1;
//    }
//
//
//    public void myRangeCheckForAdd(int index) throws Exception{
//        if (index > my_size || index < 0)
//            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
//    }
//
//    private String outOfBoundsMsg(int index) {
//        return "Index: "+index+", Size: "+my_size;
//    }






//    public MyList(int i) {
//        super(i);
//    }



}












//    public static final int   MY_MIN_VALUE = 0x80000000;
//    public static final int   MY_MAX_VALUE = 0x7fffffff;
//    public static final int MY_SOFT_MAX_ARRAY_LENGTH = MY_MAX_VALUE - 8;// = 2147483639;
//    private static final int MY_DEFAULT_CAPACITY = 10;
//    private static final Object[] MY_EMPTY_ELEMENT_DATA = {};
//    private static final Object[] MY_DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA = {};
//    transient Object[] myElementData;
//    private int my_size;
//
//    public MyList(int initialCapacity) {
//        if (initialCapacity > 0) {
//            this.myElementData = new Object[initialCapacity];
//        } else if (initialCapacity == 0) {
//            this.myElementData = MY_EMPTY_ELEMENT_DATA;
//        } else {
//            throw new IllegalArgumentException("Illegal Capacity: "+
//                    initialCapacity);
//        }
//    }
//
//    public MyList() {
//        this.myElementData = MY_DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA;
//    }
//
//    public MyList(Collection<? extends T> c) {
//        Object[] a = c.toArray();
//        if ((my_size = a.length) != 0) {
//            if (c.getClass() == ArrayList.class) {
//                myElementData = a;
//            } else {
//                myElementData = Arrays.copyOf(a, my_size, Object[].class);
//            }
//        } else {
//            // replace with empty array.
//            myElementData = MY_EMPTY_ELEMENT_DATA;
//        }
//    }
//
//    public int my_size() {
//        return my_size;
//    }
//
//    public int myIndexOf(Object o) {
//        return myIndexOfRange(o, 0, my_size);
//    }
//
//    int myIndexOfRange(Object o, int start, int end) {
//        Object[] es = myElementData;
//        if (o == null) {
//            for (int i = start; i < end; i++) {
//                if (es[i] == null) {
//                    return i;
//                }
//            }
//        } else {
//            for (int i = start; i < end; i++) {
//                if (o.equals(es[i])) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//
//    T myElementData(int index) {
//        return (T) myElementData[index];
//    }
//
//    public T get(int index) {
//        Objects.checkIndex(index, my_size);
//        return myElementData(index);
//    }
//
//    private void add(T t, Object[] elementData, int s) {
//        if (s == elementData.length)
//            elementData = grow();
//        elementData[s] = t;
//        my_size = s + 1;
//    }
//
//    public static int myNewLength(int oldLength, int minGrowth, int prefGrowth) {
//        // preconditions not checked because of inlining
//        // assert oldLength >= 0
//        // assert minGrowth > 0
//
//        int prefLength = oldLength + Math.max(minGrowth, prefGrowth); // might overflow
//        if (0 < prefLength && prefLength <= MY_SOFT_MAX_ARRAY_LENGTH) {
//            return prefLength;
//        } else {
//            // put code cold in a separate method
//            return hugeLength(oldLength, minGrowth);
//        }
//    }
//
//    private static int hugeLength(int oldLength, int minGrowth) {
//        int minLength = oldLength + minGrowth;
//        if (minLength < 0) { // overflow
//            throw new OutOfMemoryError(
//                    "Required array length " + oldLength + " + " + minGrowth + " is too large");
//        } else if (minLength <= MY_SOFT_MAX_ARRAY_LENGTH) {
//            return MY_SOFT_MAX_ARRAY_LENGTH;
//        } else {
//            return minLength;
//        }
//    }
//
//    private Object[] grow() {
//        return grow(my_size + 1);
//    }
//
//    private Object[] grow(int minCapacity) {
//        int oldCapacity = myElementData.length;
//        if (oldCapacity > 0 || myElementData != MY_DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA) {
//            int newCapacity = myNewLength(oldCapacity,
//                    minCapacity - oldCapacity, /* minimum growth */
//                    oldCapacity >> 1           /* preferred growth */);
//            return myElementData = Arrays.copyOf(myElementData, newCapacity);
//        } else {
//            return myElementData = new Object[Math.max(MY_DEFAULT_CAPACITY, minCapacity)];
//        }
//    }
//
//    private void myAdd(T e, Object[] elementData, int s) {
//        if (s == elementData.length)
//            elementData = grow();
//        elementData[s] = e;
//        my_size = s + 1;
//    }
//
//    public boolean myAdd(T e) {
//        modCount++;
//        add(e, myElementData, my_size);
//        return true;
//    }
//
//    public void myAdd(int index, T element) throws Exception {
//        myRangeCheckForAdd(index);
//        modCount++;
//        final int s;
//        Object[] elementData;
//        if ((s = my_size) == (elementData = this.myElementData).length)
//            elementData = grow();
//        System.arraycopy(elementData, index,
//                elementData, index + 1,
//                s - index);
//        elementData[index] = element;
//        my_size = s + 1;
//    }
//
//
//    public void myRangeCheckForAdd(int index) throws Exception{
//        if (index > my_size || index < 0)
//            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
//    }
//
//    private String outOfBoundsMsg(int index) {
//        return "Index: "+index+", Size: "+my_size;
//    }