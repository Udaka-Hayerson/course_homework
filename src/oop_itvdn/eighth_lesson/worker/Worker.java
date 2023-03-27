package oop_itvdn.eighth_lesson.worker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
    static ArrayList<Worker> workers = new ArrayList<>();;
    static final char[] ARR_EN = new char[]{'0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

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
        staticArrayWorkers(this);
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
        int [] index = new int[ARR_EN.length];
        for (int i = 0; i < name.toCharArray().length; i++){  //char i: s.toCharArray()) {
            for(int j = 0; j < ARR_EN.length; j++) {
                if(String.valueOf(name.toCharArray()[i]).equalsIgnoreCase(String.valueOf(ARR_EN[j]))) {
                    index[i] = j;
                }
            }
        }
        return index;
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

        System.out.println(Worker.workers);
        Worker.workExperienceOfTheEmployee(Worker.workers, reader);


        for (Worker w: Worker.workers) {
            System.out.println(w.getSurname_and_initials_of_the_employee() + " " + w.getJob_title() + " " + w.getYear_of_employment());
            for (int i: w.getAlphabet_name_index()){
                System.out.print(i + " ");
            }
            System.out.println("");
        }

        //Adamson G.D. butcher 1999
        //1 4 1 13 19 15 14 7 4 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Adidas A.A. doctor 1979
        //1 4 9 4 1 19 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Annadaugter A.D. killer 2014
        //1 14 14 1 4 1 21 7 20 5 18 1 4 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Bobetty F.T. waiter 1970
        //2 15 2 5 20 20 25 6 20 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Chardynder R.D. cooker 2008
        //3 8 1 18 4 25 14 4 5 18 18 4 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Charlyrger K.L. judge 2012
        //3 8 1 18 12 25 18 7 5 18 11 12 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Haragender O.W. pianist 1988
        //8 1 18 1 7 5 14 4 5 18 15 23 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Harrdidun D.R. engineer 2006
        //8 1 18 18 4 9 4 21 14 4 18 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Harryson R.W. lawyer 2001
        //8 1 18 18 25 19 15 14 18 23 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Jackson J.S. singer 1991
        //10 1 3 11 19 15 14 10 19 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Jadefor U.A. teacher 1960
        //10 1 4 5 6 15 18 21 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Jordidash J.H. manager 2002
        //10 15 18 4 9 4 1 19 8 10 8 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Pikula M.S. not programmer 1994
        //16 9 11 21 12 1 13 19 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Slabous A.G. programmer 2020
        //19 12 1 2 15 21 19 1 7 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Paskuda O.A. school director 2000
        //16 1 19 11 21 4 1 15 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
        //Zalujniy V.F. General 2010
        //26 1 12 21 10 14 9 25 22 6 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0

    }
}