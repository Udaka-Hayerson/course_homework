package oop_itvdn.tenth_lesson.my_dictionary_generics;

//Задание 3
//Создайте проект, используя IntelliJ IDEA.
//Создайте класс MyDictionary<TKey,TValue>. Реализуйте в простейшем приближении возможность
//использования его экземпляра. Минимально требуемый интерфейс взаимодействия с экземпляром,
//должен включать метод добавления пар элементов, индексатор для получения значения элемента по
//указанному индексу и свойство только для чтения для получения общего количества пар элементов.


import java.util.ArrayList;

public class MyDictionary <TKey,TValue>{
    public ArrayList<TKey> array_of_key;
    public ArrayList<TValue> array_of_value;
    private static final int DEFAULT_LENGTH = 10;
    public int mdlength = 0;


    public MyDictionary() {
        this.array_of_key = new ArrayList<TKey>(DEFAULT_LENGTH);
        this.array_of_value = new ArrayList<TValue>(DEFAULT_LENGTH);
    }

    public int size() {
        return mdlength;
    }



    public Object getValue(Object key) {
        for (int i = 0; i < mdlength - 1; i++) {
            if(array_of_key.get(i).equals((TKey)key)){
                return array_of_value.get(i);
            } else if (i == mdlength + 1){
                return null;
            }
        }
        return null;
    }

    public Object getKey(Object value) {
        for (int i = 0; i < mdlength - 1; i++) {
            if(array_of_value.get(i).equals((TValue) value)){
                return array_of_key.get(i);
            } else if (i == mdlength + 1){
                return null;
            }
        }
        return null;
    }

    public Object put(Object key, Object value) {
        array_of_key.add((TKey) key);
        array_of_value.add((TValue) value);
        mdlength += 1;
        return null;
    }

    public Object remove(Object key) {
        for (int i = 0; i < mdlength - 1; i++) {
            if(array_of_key.get(i).equals((TKey)key)){
                array_of_value.remove(i);
                array_of_key.remove(i);
                mdlength--;
            } else if (i == mdlength + 1){
                return null;
            }
        }
        return null;

    }
}
