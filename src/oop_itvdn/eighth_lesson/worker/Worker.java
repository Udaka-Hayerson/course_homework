package oop_itvdn.eighth_lesson.worker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Задание 2
//Создайте проект, используя IntelliJ IDEA.
//Требуется:
//Описать класс с именем Worker, содержащую следующие поля:
// фамилия и инициалы работника;
// название занимаемой должности;
// год поступления на работу.
//Написать программу, выполняющую следующие действия:
// ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны
//быть упорядочены по алфавиту);
// если значение года введено
// не в соответствующем формате выдает исключение.
// вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
// TODO: хочу зробити два рішення 1)впорядкуавння по алфавіту після створення масиву екземплярів
// TODO:2) під час створення екземплярів вони вже будуть поміщатися в масив на потрібне місце - true \/


public class Worker {


    private String surname_and_initials_of_the_employee;
    private String job_title;
    private int year_of_employment;
    private final int[] alphabet_name_index;
    private final BigInteger alphabet_name_index_count; // числове представлення масиву отримане множенням його значення на його індекс
    static ArrayList<Worker> workers = new ArrayList<>();
//    static ArrayList<Worker> workers_i_count = new ArrayList<>();
    static ArrayList<Integer> truncated_array = new ArrayList<>();
//    static final char[] ARR_EN = new char[]{'0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static final char[] ABC_WITHOUT_0_TO_9 = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public Worker(String surname_and_initials_of_the_employee, String job_title, int year_of_employment) throws Exception {
        this.surname_and_initials_of_the_employee = surname_and_initials_of_the_employee;
        this.job_title = job_title;
        try {
            if (year_of_employment < 1923 || year_of_employment > 2023 ) {
                throw new Exception("incorrect year_of_employment");
            } else {this.year_of_employment = year_of_employment;}
        } catch (Exception e){
            this.year_of_employment = 0;
            System.out.println(e.getMessage());
        }
        this.alphabet_name_index = generateAlphabetNameIndex(surname_and_initials_of_the_employee);
        this.alphabet_name_index_count = generateAlphabetNameIndexCount(truncated_array);
        staticArrayWorkers(this);
//        staticArrayWorkersCountIndex(this);
    }

    static void workExperienceOfTheEmployee(ArrayList<Worker> workers, BufferedReader reader) throws IOException {
        Exception ex = new Exception("incorrect work Experience Of The Employee");
        int experience = Integer.parseInt(reader.readLine());
        try {
            if (experience > 80 || experience <= 0 ) {
                throw ex;
            } else {
                for (Worker w: workers) {
                    if (w.getYear_of_employment() >= experience){
                        System.out.println(w.getSurname_and_initials_of_the_employee());
                        System.out.println(2023 - w.getYear_of_employment());
                    }
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


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


    private static void staticArrayWorkers(Worker worker) {
        // algorithm
        workers.add(worker);
        if(workers.size() > 1){
            for (int i = 0; i < workers.size(); i++) {
                if (i == workers.size() - 1)
                    break;
                for (int j = 0; j < workers.get(i).alphabet_name_index.length; j++) {
                    if(workers.get(i).alphabet_name_index[j] > workers.get(i + 1).alphabet_name_index[j]) {
                        Worker w = workers.get(i);
                        workers.set(i, workers.get(i + 1));
                        workers.set(i + 1, w);
                        break;
                    } else if(workers.get(i).alphabet_name_index[j] < workers.get(i + 1).alphabet_name_index[j]) {
                        break;
                    }
                }
            }
        }
    }

//    private static void staticArrayWorkersCountIndex(Worker worker) {
//        workers_i_count.add(worker);
//
//    }

    public String getSurname_and_initials_of_the_employee() {
        return surname_and_initials_of_the_employee;
    }

    public void setSurname_and_initials_of_the_employee(String surname_and_initials_of_the_employee) {
        this.surname_and_initials_of_the_employee = surname_and_initials_of_the_employee;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public int getYear_of_employment() {
        return year_of_employment;
    }

    public void setYear_of_employment(int year_of_employment) {
        this.year_of_employment = year_of_employment;
    }

    public int[] getAlphabet_name_index() {
        return alphabet_name_index;
    }
    public BigInteger getAlphabet_name_index_count() {
        return alphabet_name_index_count;
    }

    public static ArrayList<Worker> getWorkers() {
        return workers;
    }
}


    class TestWorker {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Worker worker_n = new Worker(reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()));
        Worker worker_m = new Worker(reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()));

        Worker worker_1 = new Worker("Zalujniy V.F.", "General", 2010);
        Worker worker_2 = new Worker("Bobetty F.T.", "waiter", 1970);
        Worker worker_3 = new Worker("Adamson G.D.", "butcher", 1999);
        Worker worker_4 = new Worker("Charlyrger K.L.", "judge", 2012);
        Worker worker_5 = new Worker("Jackson J.S.", "singer", 1991);
        Worker worker_6 = new Worker("Annadaugter A.D.", "killer", 2014);
        Worker worker_7 = new Worker("Adidas A.A.", "doctor", 1979);
        Worker worker_8 = new Worker("Harryson R.W.", "lawyer", 2001);
        Worker worker_9 = new Worker("Jordidash J.H.", "manager", 2002);
        Worker worker_10 = new Worker("Harrdidun D.R.", "engineer", 2006);
        Worker worker_11 = new Worker("Chardynder R.D.", "cooker", 2008);
        Worker worker_12 = new Worker("Haragender O.W.", "pianist", 1988);
        Worker worker_13 = new Worker("Jadefor U.A.", "teacher", 1960);
        Worker worker_14 = new Worker("Slabous A.G.", "programmer", 2020);
        Worker worker_15 = new Worker("Pikula M.S.", "not programmer", 1994);
        Worker worker_16 = new Worker("Paskuda O.A.", "school director", 2000);

        Worker.workExperienceOfTheEmployee(Worker.workers, reader);

        System.out.println(Worker.workers);
//        System.out.println(Worker.workers_i_count);
        for (Worker w: Worker.workers) {
            System.out.println(w.getSurname_and_initials_of_the_employee() + " " + w.getJob_title() + " " + w.getYear_of_employment());
            System.out.println(w.getAlphabet_name_index_count());
            for (int i: w.getAlphabet_name_index()){
                System.out.print(i + " ");
            }
            System.out.println("");
        }

//        for (Worker w: Worker.workers_i_count) {
//            System.out.println(w.getSurname_and_initials_of_the_employee() + " " + w.getJob_title() + " " + w.getYear_of_employment());
//            System.out.println(w.getAlphabet_name_index_count());
//        }


/*        output

        Adamson G.D. butcher 1999
        1013102228242316130000000000000000000000000000000000
        10 13 10 22 28 24 23 16 13 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Adidas A.A. doctor 1979
        1013181310281010000000000000000000000000000000000000
        10 13 18 13 10 28 10 10 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Annadaugter A.D. killer 2014
        1023231013103016291427101300000000000000000000000000
        10 23 23 10 13 10 30 16 29 14 27 10 13 0 0 0 0 0 0 0 0 0 0 0 0 0
        Bobetty F.T. waiter 1970
        1124111429293415290000000000000000000000000000000000
        11 24 11 14 29 29 34 15 29 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Chardynder R.D. cooker 2008
        1217102713342313142727130000000000000000000000000000
        12 17 10 27 13 34 23 13 14 27 27 13 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Charlyrger K.L. judge 2012
        1217102721342716142720210000000000000000000000000000
        12 17 10 27 21 34 27 16 14 27 20 21 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Haragender O.W. pianist 1988
        1710271016142313142724320000000000000000000000000000
        17 10 27 10 16 14 23 13 14 27 24 32 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Harrdidun D.R. engineer 2006
        1710272713181330231327000000000000000000000000000000
        17 10 27 27 13 18 13 30 23 13 27 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Harryson R.W. lawyer 2001
        1710272734282423273200000000000000000000000000000000
        17 10 27 27 34 28 24 23 27 32 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Jackson J.S. singer 1991
        1910122028242319280000000000000000000000000000000000
        19 10 12 20 28 24 23 19 28 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Jadefor U.A. teacher 1960
        1910131415242730100000000000000000000000000000000000
        19 10 13 14 15 24 27 30 10 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Jordidash J.H. manager 2002
        1924271318131028171917000000000000000000000000000000
        19 24 27 13 18 13 10 28 17 19 17 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Pikula M.S. not programmer 1994
        2518203021102228000000000000000000000000000000000000
        25 18 20 30 21 10 22 28 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Slabous A.G. programmer 2020
        2821101124302810160000000000000000000000000000000000
        28 21 10 11 24 30 28 10 16 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Paskuda O.A. school director 2000
        2510282030131024100000000000000000000000000000000000
        25 10 28 20 30 13 10 24 10 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        Zalujniy V.F. General 2010
        3510213019231834311500000000000000000000000000000000
        35 10 21 30 19 23 18 34 31 15 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0

        output*/


    }
}