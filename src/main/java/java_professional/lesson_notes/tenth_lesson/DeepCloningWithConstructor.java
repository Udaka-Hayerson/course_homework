package java_professional.lesson_notes.tenth_lesson;

class Rider{
    private int age;
    private String name;

    public Rider( int age, String name) {
        this.age = age;
        this.name = name;
    }

    // copy constructor
    public Rider(Rider other){
        this(other.age, other.name);
    }

    @Override
    public String toString() {
        return "Rider{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class DeepCloningWithConstructor {
    public static void main(String[] args) {
        Rider original = new Rider( 28,"Wind");
        Rider cloneRider = new Rider(original);
    }
}
