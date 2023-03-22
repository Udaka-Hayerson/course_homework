package oop_itvdn.eighth_lesson.worker;
//Вирішення неправельне тому що alphabet_name_index не відображає правельну позицію
// по причині того що індекси літер бувають двозначені
// TODO: вирішення проблеми - зробити поле  alphabet_name_index масивом індексів літералів

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

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
    private long alphabet_name_index;


    public Worker(String surname_and_initials_of_the_employee, String job_title, int year_of_employment) throws Exception {
        this.surname_and_initials_of_the_employee = surname_and_initials_of_the_employee;
        this.job_title = job_title;
        this.year_of_employment = year_of_employment;
        this.alphabet_name_index = generateAlphabetNameIndex(surname_and_initials_of_the_employee);
    }


    public long generateAlphabetNameIndex(String s) { // Harry R.W.
        char[] arr_en = new char[]{'0','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        s = (s.replace(" ", "")).replace(".", "");
        String answerij = "";
        long index_forij = 0;

//        String answeri = "";
//        long index_fori = 0;

//1.1 виріщення з двома циклами
        for (char i: s.toCharArray()) {
            for(int j = 0; j < arr_en.length; j++) {
                if(String.valueOf(i).equalsIgnoreCase(String.valueOf(arr_en[j]))) {
                    index_forij = j;
                    answerij += index_forij;
                }
            }
        }
        index_forij = Long.parseLong(answerij);

        // 1.2 виріщення з одним явним циклом і одним підкапотним
//        for (char i: s.toCharArray()) {
//            index_fori = Arrays.asList(arr_en).indexOf(i);
//            answeri += index_fori;
//
//        }
//        index_fori = Long.parseLong(answeri); //error


// просто перевірка чи однакові результати видають спосіб 1.1 і 1.2
//        if(index_forij == index_fori){
//            for (int i = 0; i < 19 - answerij.length(); i++) {
//                answerij += "0";
//            }
//            index_forij = Long.parseLong(answerij);
//
//        }

        int answerij_length = answerij.length();
        for (int i = 0; i < 19 - answerij_length; i++) {
                answerij += "0";
            }
            index_forij = Long.parseLong(answerij);

        return index_forij;
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

    public long getAlphabet_name_index() {
        return alphabet_name_index;
    }

    public void setAlphabet_name_index(long alphabet_name_index) {
        this.alphabet_name_index = alphabet_name_index;
    }
}


    class Main {
    public static void main(String[] args) throws Exception {


//        char[] arr_EN = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//        long 19characters = 9223372036854775807


        Worker worker_1 = new Worker("Harry R.W.", "engineer", 1999);
        Worker worker_2 = new Worker("Bob F.T.", "waiter", 1970);
        Worker worker_3 = new Worker("Adam G.D.", "butcher", 2003);
        Worker worker_4 = new Worker("Charly K.L.", "judge", 2012);
        Worker worker_5 = new Worker("Jack J.S.", "programmer", 1991);
        Worker worker_6 = new Worker("Anna O.P.", "killer", 2020);

        Worker [] workers = new Worker[]{worker_3, worker_6, worker_2, worker_4, worker_1, worker_5};

        System.out.println(workers);



        System.out.println("" + worker_1.getAlphabet_name_index());
        System.out.println("" + worker_2.getAlphabet_name_index());
        System.out.println("" + worker_3.getAlphabet_name_index());
        System.out.println("" + worker_4.getAlphabet_name_index());
        System.out.println("" + worker_5.getAlphabet_name_index());
        System.out.println("" + worker_6.getAlphabet_name_index());
//        8118182518230000000
//        2152620000000000000
//        1411374000000000000
//        3811812251112000000
//        1013111019000000000
//        1141411516000000000




    }
}























