package oop_itvdn.fourth_lesson.document_handler;

import java.io.*;

public class XMLHandler extends AbstractHandler {


    FileWriter writer;
    String text;

    public XMLHandler() throws Exception {
        this.writer = null;
        this.text = "";
    }


    @Override
    void open(){
        try(FileReader f_reader = new FileReader("dist/document.xml"))
        {
            // читаем посимвольно
            int c;
            while((c=f_reader.read())!=-1){

                System.out.print((char)c);
            }
            System.out.println("");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }

    @Override
    void create() throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));)
        {
            this.writer = new FileWriter("dist/document.xml", false);
            System.out.println("Enter the document");
            this.text = reader.readLine();
            System.out.println("enter yes if you want to save the file");
            String save_answer = reader.readLine();
            if (save_answer.equalsIgnoreCase("yes"))
            {
                this.save();
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    @Override
    void change() throws Exception {
        String answer = "yes";
        while (answer.equalsIgnoreCase("yes")){
            this.open();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nEnter the document");
            this.text = reader.readLine();
            System.out.println("enter yes if you want to save the file again");
            String save_answer = reader.readLine();
            if (save_answer.equalsIgnoreCase("yes")){
                this.save();
            }
            System.out.println("enter yes if you want to modify the file again");
            answer = reader.readLine();

        }

    }

    @Override
    void save() throws Exception{
        this.writer = new FileWriter("dist/document.xml", false);
        this.writer.write(this.text);
        this.writer.flush();
        this.writer.close();
    }
}
