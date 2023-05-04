package java_professional.lesson_notes.ninth_lesson;

import java.io.*;

public class SimpleStaticSerialization implements Serializable{
    private static int staticNumber ;
    private int nonStaticNumber;

    public SimpleStaticSerialization(int nonStaticNumber) {
        this.nonStaticNumber = nonStaticNumber;
        staticNumber = nonStaticNumber;
    }
    public static void serializeStatic(ObjectOutputStream oos) throws IOException {
        oos.writeInt(staticNumber);
    }
    public static void deserializeStatic(ObjectInputStream ois) throws IOException {
        staticNumber = ois.readInt();
    }

    @Override
    public String toString() {
        return staticNumber + " " + nonStaticNumber;
    }
}
 class Dispatcher{
     public static void main(String[] args) {
         SimpleStaticSerialization s = new SimpleStaticSerialization(10);
         File file = new File("C:\\Users\\Nickolas\\IdeaProjects\\untitled666\\src\\java_professional\\lesson_notes\\ninth_lesson\\static_context_file.txt");
         System.out.println("First value " + s);
         try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
              ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

             SimpleStaticSerialization.serializeStatic(oos);
             oos.writeObject(s);

             s = new SimpleStaticSerialization(30);
             System.out.println("After serilization " + s);

             SimpleStaticSerialization.deserializeStatic(ois);
             s = (SimpleStaticSerialization) ois.readObject();

             System.out.println("After deserilization " + s);
         } catch (IOException | ClassNotFoundException e) {
             e.printStackTrace();
         }
     }
 }