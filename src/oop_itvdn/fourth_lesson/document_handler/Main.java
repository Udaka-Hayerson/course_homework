package oop_itvdn.fourth_lesson.document_handler;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("if you want to save the file enter format txt or xml or doc");
        String user_answer = reader.readLine();
        if (user_answer.equalsIgnoreCase("txt")) {
            AbstractHandler txtHandler = new TXTHandler();
            txtHandler.create();
            txtHandler.open();
            txtHandler.change();
//            txtHandler.save();
        } else if (user_answer.equalsIgnoreCase("xml")){
            AbstractHandler xmlHandler = new XMLHandler();
            xmlHandler.create();
            xmlHandler.open();
            xmlHandler.change();
            xmlHandler.save();
        } else if (user_answer.equalsIgnoreCase("doc")){
            AbstractHandler docHandler = new DOCHandler();
            docHandler.create();
            docHandler.open();
            docHandler.change();
            docHandler.save();
        } else {
            System.out.println("Wrong Answer");
        }

    }
}
