package java_start_itvdn.classchild;

import static java_start_itvdn.classchild.ClassChild.pubSetClassChild;

public class Main {

    public static void main(String[] args) {

        int numb = 6;
        ClassChild cc = pubSetClassChild(numb);
        System.out.println(cc);
        System.out.println(cc.getNumber());

    }
}


