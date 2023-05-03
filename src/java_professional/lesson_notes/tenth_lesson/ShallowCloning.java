package java_professional.lesson_notes.tenth_lesson;

class Student implements Cloneable{
    public String name;
    public int age;
    public Group group;

    Student(){}

    public Student(String name, int age, Group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }
}

class Group{
    public  int id;

    public Group(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                '}';
    }
}
public class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Group group = new Group(1);
        Student student = new Student("Udo", 28, group);
        Student cloneStudent = (Student) student.clone();
        System.out.println(student);
        System.out.println(cloneStudent);
        cloneStudent.name = "Jack";
        cloneStudent.group.id = 10;
        System.out.println(student);
        System.out.println(cloneStudent);
    }
}


















