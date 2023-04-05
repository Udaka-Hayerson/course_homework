package oop_itvdn.tenth_lesson.test_solution;

//Задание 2
//Создайте проект, используя IntelliJ IDEA.
//Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его
//экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс взаимодействия с
//экземпляром, должен включать метод добавления элемента, индексатор для получения значения
//элемента по указанному индексу и свойство только для чтения для получения общего количества
//элементов.


public interface Pikterface<P> {

    void add(P value, boolean b);

    P getElementOfIndex(int index);

    void setValueOfKey(P value , int index);

    int getIndexOfValue(P value);

    int size();

//    void sort();

}

class PikuList<P> implements Pikterface<P> {

    private Object[] pikulist = new Object[DEFAULT_LENGTH];
    private int pikulength;
    private static final int DEFAULT_LENGTH = 10;

    private int add_count = 0; //    private int сapacity = 10;
    //addcount не використовується але дає розуміння скільки елементив
    // користувач додав до масиву


    public PikuList() {
        this.pikulist = new Object[DEFAULT_LENGTH];
        this.pikulength = pikulist.length;
    }

    public void increasingSizePikuList(boolean b) {
        Object[] new_array = new Object[(int)add_count + 1];
        if (b){

            for (int i = 0; i < new_array.length; i++) {
                if (i < add_count) {
                    new_array[i] = pikulist[i];
                } else {
                    new_array[i] = null;
                }
            }
        } else {
            for (int i = 0; i < new_array.length; i++) {
                if (i == 0){
                    new_array[i] = null;
                } else {
                    new_array[i] = pikulist[i - 1];
                }
            }

        }
        this.setPikulist(new_array);
        this.setPikulength(new_array.length);

    }


    public void add(P value, boolean b) {
        if (b){
            this.increasingSizePikuList(b);
            pikulist[add_count] = value;
            this.setAddcount(this.getAddcount() + 1);
        } else {
            this.increasingSizePikuList(b);
            pikulist[0] = value;
            this.setAddcount(this.getAddcount() + 1);
        }

    }

    public P getElementOfIndex(int index) {
        if(index > pikulength - 1 || index < 0) {
            try {
                throw new IndexOutOfBoundsException("Index Out Of Bounds");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        return (P) pikulist[index];
    }

    public int getIndexOfValue(Object value) {
        for (int i = 0; i < pikulength; i++) {
            if (value.equals(pikulist[i])){
                return i;
            }
        }
        return -1;
 }

    public void setValueOfKey(P value, int index) {
        if(index == add_count){ //pikulength
            this.add(value, true);
        } else if(index > 0 && index > add_count && index < pikulength){
            pikulist[index] = value;
        } else if(index >= pikulength){
            this.setAddcount(index + 1);
            this.increasingSizePikuList(true);

            System.out.println("");
        }
    }


    public int size() {
        return pikulength;
    }

    public Object[] getPikulist() {
        return pikulist;
    }

    public void setPikulist(Object[] pikulist) {
        this.pikulist = pikulist;
    }

    public int getPikulength() {
        return pikulength;
    }

    public void setPikulength(int pikulength) {
        this.pikulength = pikulength;
    }

    public int getAddcount() {
        return add_count;
    }

    public void setAddcount(int add_count) {
        this.add_count = add_count;
    }


//    public void sort() {
//        System.out.println("");
//    }

}

//    @Override
//    @SuppressWarnings("unchecked")
//    public void sort(Comparator<? super E> c) {
//        final int expectedModCount = modCount;
//        Arrays.sort((E[]) elementData, 0, size, c);
//        if (modCount != expectedModCount)
//            throw new ConcurrentModificationException();
//        modCount++;
//    }

class PikuTest {
    public static void main(String[] args) {
        PikuList<String> pl = new PikuList<>();
        pl.add("I", true);
        pl.add("K", true);
        pl.add("U", true);
        pl.add("L", true);
        pl.add("A", true);
        pl.add("P", false);
        for (int i = 0; i < pl.size(); i++) {
            System.out.print(pl.getElementOfIndex(i));
        }
    }
}