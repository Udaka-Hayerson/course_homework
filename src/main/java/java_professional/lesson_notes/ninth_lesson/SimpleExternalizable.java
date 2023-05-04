package java_professional.lesson_notes.ninth_lesson;

import java.io.*;

class Rider implements Externalizable {
    private int id;
    private transient String name;


    public Rider() {}

    public Rider(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Rider{" +
                "id=" + id +
                ", name='" + name + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        name = (String) in.readObject();
    }
}

public class SimpleExternalizable{
    public static void main(String[] args) {
        Rider rider = new Rider(69, "Udo");
        File file = new File("C:\\Users\\Nickolas\\IdeaProjects\\untitled666\\src\\java_professional\\lesson_notes\\ninth_lesson\\rider_file.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            oos.writeObject(rider);
            rider = (Rider) ois.readObject();
            System.out.println(rider);
        } catch (ClassNotFoundException|IOException e) {
            e.printStackTrace();
        }
    }
}
