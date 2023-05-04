package java_professional.lesson_notes.first_lesson;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;


class AnimalSort implements Comparable<AnimalSort> {


    static final char[] ABC_WITHOUT_0_TO_9 = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private final int[] alphabet_name_index;
    static ArrayList<Integer> truncated_array = new ArrayList<>();
    private final BigInteger alphabet_name_index_count;
    String breed;
    int weight;
    int speed;
    int price;

    public AnimalSort(String breed, int weight, int speed, int price) {
        this.alphabet_name_index = generateAlphabetNameIndex(breed);
        this.alphabet_name_index_count = generateAlphabetNameIndexCount(truncated_array);
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "breed = " + breed +
                " index = " + alphabet_name_index_count +
                " weight = " + weight +
                " speed = " + speed +
                " price = " + price + '\n';
    }

    @Override
    public int compareTo(AnimalSort a) { // implements Comparable<AnimalSort>
        int s = this.speed - a.speed;
        int p = this.price - a.price;
        int w = this.weight - a.weight;
        if (s != 0) return s;
        else if (p != 0) return p;
        else if (w != 0) return w;
        else return this.breed.compareTo(a.breed);
    }

/*    @Override
    public int compareTo(Object o) {  // implements Comparable
        int s = this.speed - ((AnimalSort)o).speed;
        int p = this.price - ((AnimalSort)o).price;
        int w = this.weight - ((AnimalSort)o).weight;
        if (s != 0) return s;
        else if (p != 0) return p;
        else if (w != 0) return w;
        else {
            for (int i = 1; i < this.alphabet_name_index.length; i++) {
                for (int j = 1; j < ((AnimalSort)o).alphabet_name_index.length; j++) {
                    if(this.alphabet_name_index[i] == ((AnimalSort)o).alphabet_name_index[j]) {
                        break;
                    } else return this.alphabet_name_index[i] - ((AnimalSort)o).alphabet_name_index[j];
                }
            }
            return 0;
        }
    }*/


/* TODO: update - варіант @Override з числом alphabet_name_index_count не працює
і варіант @Override з числом alphabet_name_index_count ,
і варіант @Override з масивом alphabet_name_index є робочими
   @Override
    public int compareTo(Object o) {
        int s = this.speed - ((AnimalSort)o).speed;
        int p = this.price - ((AnimalSort)o).price;
        int w = this.weight - ((AnimalSort)o).weight;
        BigInteger b_i = this.alphabet_name_index_count.subtract(((AnimalSort)o).alphabet_name_index_count);
        int b = b_i.intValue();
        if (s != 0) return s;
        else if (p != 0) return p;
        else if (w != 0) return w;
        else if (this.alphabet_name_index_count.compareTo(((AnimalSort)o).alphabet_name_index_count) == 0) return 0;
        else  return b;

    }*/

    private int[] generateAlphabetNameIndex(String name) {
        name = (name.replace(" ", "")).replace(".", "");
        char [] array_name = name.toCharArray();
        int [] index = new int[ABC_WITHOUT_0_TO_9.length - 10];
        ArrayList<Integer> index_truncated_array = new ArrayList<>(array_name.length);
        for (int i = 0; i < array_name.length; i++) {
            for(int j = 10; j < ABC_WITHOUT_0_TO_9.length; j++) {
                if(String.valueOf(array_name[i]).equalsIgnoreCase(String.valueOf(ABC_WITHOUT_0_TO_9[j]))) {
                    index[i] = j;
                    index_truncated_array.add(j);
                }
            }
        }
        truncated_array = index_truncated_array;
        return index;
    }

    private BigInteger generateAlphabetNameIndexCount(ArrayList<Integer> abc) {
        String s_name_index = "";
        for (int i = 0; i < ABC_WITHOUT_0_TO_9.length - 10; i++) {

            if (i < abc.size()) {
                s_name_index += abc.get(i);
            } else {
                s_name_index += "00";
            }
        }
        return new BigInteger(s_name_index);
    }

}

public class SortingAnimal {
    public static void main(String[] args) {
        extractedSort();
//        extracted();

    }

    private static void extractedSort() {
        AnimalSort cat = new AnimalSort("Maveric", 10, 30, 500);
        AnimalSort dog = new AnimalSort("Maveric", 30, 40, 1000);
        AnimalSort bird = new AnimalSort("Crow", 1, 100, 200);
        AnimalSort lion = new AnimalSort("Lion", 100, 50, 100000);

        AnimalSort a = new AnimalSort("Ghij", 100, 50, 100000);
        AnimalSort b = new AnimalSort("Fghi", 100, 50, 100000);
        AnimalSort c = new AnimalSort("Efgh", 100, 50, 100000);
        AnimalSort d = new AnimalSort("Defg", 100, 50, 100000);
        AnimalSort e = new AnimalSort("Cdef", 100, 50, 100000);
        AnimalSort f = new AnimalSort("Bcde", 100, 50, 100000);
        AnimalSort g = new AnimalSort("Abcd", 100, 50, 100000);


        AnimalSort[] alphabet_sorts = {a, b, c, d, e, f, g};
        AnimalSort[] alphabet_sorts_z = {g, f, e, d, c, b, a};
        AnimalSort[] alphabet_sorts_random = {b, a, e, c, g, f, d};
        AnimalSort[] alphabet_sorts_replay = {b, a, e, c, g, f, d, g, f, e, d, c, b, a, a, b, c, d, e, f, g};


        Arrays.sort(alphabet_sorts);
        Arrays.sort(alphabet_sorts_z);
        Arrays.sort(alphabet_sorts_random);
        Arrays.sort(alphabet_sorts_replay);

        System.out.println(Arrays.toString(alphabet_sorts));
        System.out.println(Arrays.toString(alphabet_sorts_z));
        System.out.println(Arrays.toString(alphabet_sorts_random));
        System.out.println(Arrays.toString(alphabet_sorts_replay));

        AnimalSort[] animal_sorts = {cat, dog, bird, lion};
        Arrays.sort(animal_sorts); // ClassCastException without implements Comparable and @Override compareTo(Object o)
        System.out.println(Arrays.toString(animal_sorts));

    }


    private static void extracted() {
        Integer[] marcs = {1, 5, 8, 6, 9, 11, 3};
        String[] students = {"Alex", "Andrew", "Yevhenii", "Karina"};
        Integer[] index = {1, 5, 8, 6, 9, 11, 3, 7, 2, 1, 15, 54, 28, 60, 99, 17, };
        String[] all_students = {"Alex", "Andrew", "Yevhenii", "Karina", "Mykola", "Oleg", "Viktor"};
        Character[] arr_en = {'g', 't', 'c', 'd', 'n', 'f', 'a', 'z', 'i', 'y', 'k', 'l', 'm', 'e', 'j', 'p', 'q', 'r', 's', 'b', 'u', 'v', 'o', 'w', 'x', 'j', 'h'};
        Character[] dual_arr_en = {'g', 't', 'c', 'd', 'n', 'f', 'a', 'z', 'i', 'y', 'k', 'l', 'm', 'e', 'j', 'p', 'q', 'r', 's', 'b', 'u', 'v', 'o', 'w', 'x', 'j', 'h'};
        Arrays.sort(marcs);
        Arrays.sort(students);
        Arrays.sort(arr_en);

        for (int i : marcs) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (String s : students) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (Character c : arr_en) {
            System.out.print(c + " ");
        }
        DualPivotQuickSort dualPivotQuickSort = new DualPivotQuickSort(); //@author : https://github.com/acbin
        dualPivotQuickSort.sort(all_students);
        dualPivotQuickSort.sort(index);
        dualPivotQuickSort.sort(dual_arr_en);
        System.out.println();
        for (int i : index) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (String s : all_students) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (Character c : dual_arr_en) {
            System.out.print(c + " ");
        }
    }

}
