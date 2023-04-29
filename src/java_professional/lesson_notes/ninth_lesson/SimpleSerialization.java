package java_professional.lesson_notes.ninth_lesson;

import java.io.*;
import java.util.Objects;

class Student implements Serializable {
    private int id;
    private String name;
    private Group group = null;

    public Student() {}

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group=" + group +
                '}';
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}

class Group implements Serializable{
    private String name;
    private Student student = null;

    public Group() {
    }
    public Group(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", student=" + student.getName() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
public class SimpleSerialization {
    public static void main(String[] args) {

        Group group = new Group("android dev");
        Student student = new Student(1, "Mykola");
        student.setGroup(group);
        group.setStudent(student);
/*       If student.toString() will refer to groop.toString(),
        then we will get a recursive call of obj..toString() and as a result java.lang.StackOverflowError .
        Solution of this problem - student.hashCode() or student.getField() */

        File file = new File("C:\\Users\\Nickolas\\IdeaProjects\\untitled666\\src\\java_professional\\lesson_notes\\ninth_lesson\\student_file.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            oos.writeObject(student);
            Student stud = (Student) ois.readObject();
            System.out.println(stud);
        } catch (ClassNotFoundException|IOException e) {
            e.printStackTrace();
        }
    }
}
