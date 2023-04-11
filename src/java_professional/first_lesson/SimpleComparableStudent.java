package java_professional.first_lesson;

import java.util.Arrays;

public class SimpleComparableStudent implements Comparable<SimpleComparableStudent>{

    private String first_name;
    private int group;

    public SimpleComparableStudent(String first_name, int group) {
        this.first_name = first_name;
        this.group = group;
    }

/*    @Override
    public int compareTo(SimpleComparableStudent o) {
        if (this.group > o.group) return 1;
        else if (this.group < o.group) return -1;
        else return 0;
    }*/

    @Override
    public int compareTo(SimpleComparableStudent o) {
        int g = Integer.compare(this.group, o.group);
        if (g == 0) return this.first_name.compareTo(o.first_name);
        else return g;
    }

    @Override
    public String toString() {
        return first_name + " " + group;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }


}
class SimpleComparableStudent_TEST {
    public static void main(String[] args) {
        SimpleComparableStudent scs_1 = new SimpleComparableStudent("Jack", 1);
        SimpleComparableStudent scs_2 = new SimpleComparableStudent("John", 2);
        SimpleComparableStudent scs_3 = new SimpleComparableStudent("Anna", 3);
        SimpleComparableStudent scs_4 = new SimpleComparableStudent("Nikolas", 6);
        SimpleComparableStudent scs_5 = new SimpleComparableStudent("Andrew", 6);
        SimpleComparableStudent scs_6 = new SimpleComparableStudent("Zorg", 4);

        SimpleComparableStudent[] scs_array = {scs_1, scs_2, scs_3, scs_4, scs_5, scs_6};

        SimpleComparableStudent[] new_scs_array = { new SimpleComparableStudent("Jack", 1),
                new SimpleComparableStudent("John", 2),
                new SimpleComparableStudent("Anna", 3),
                new SimpleComparableStudent("Nikolas", 6),
                new SimpleComparableStudent("Andrew", 6),
                new SimpleComparableStudent("Zorg", 4)
        };

        Arrays.sort(scs_array);
        Arrays.sort(new_scs_array);
        for (int i = 0; i < scs_array.length; i++) {
            System.out.println(scs_array[i].toString());
        }

        for (SimpleComparableStudent s: new_scs_array) {
            System.out.println(s);

        }

    }

}