package java_professional.lesson_notes.tenth_lesson;

import java.io.*;

class Lion implements Serializable{
    private String name;
    private int age;
    private int loot_counter;

    public Lion(){}
    public Lion(String name, int age, int loot_counter) {
        this.name = name;
        this.age = age;
        this.loot_counter = loot_counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLoot_counter() {
        return loot_counter;
    }

    public void setLoot_counter(int loot_counter) {
        this.loot_counter = loot_counter;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", loot_counter=" + loot_counter +
                '}';
    }
}
public class SerelizationCloning {
    public static void main(String[] args) {
        Lion lion = new Lion("King", 6, 666);
        ByteArrayOutputStream baos = null;
        ByteArrayInputStream bais = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(lion);
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            Lion cloneLion = (Lion) ois.readObject();
            cloneLion.setLoot_counter(777);
            System.out.println(lion);
            System.out.println(cloneLion);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();;
        } finally {
            if(baos != null) {
                try {
                    baos.flush();
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bais != null){
                try {
                    bais.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(oos != null){
                try {
                    oos.flush();
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
