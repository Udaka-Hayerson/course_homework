package java_professional.lesson_notes.tenth_lesson;

import java.lang.reflect.Field;

class Eagle{
    private String name;
    private int age;
    private int loot_counter;

    public Eagle(){}
    public Eagle(String name, int age, int loot_counter) {
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
        return "Eagle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", loot_counter=" + loot_counter +
                '}';
    }
}
public class ReflectionCloning {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Eagle eagle = new Eagle("Endy Eagle", 2, 666);
        Eagle copyEagle = ReflectionCloning.reflectionCloning(eagle);
    }


    private static Eagle reflectionCloning(Eagle e) throws NoSuchFieldException, IllegalAccessException {
        Field loot_counter = Eagle.class.getDeclaredField("loot_counter");
        Field name = Eagle.class.getDeclaredField("name");
        Field age = Eagle.class.getDeclaredField("age");
        loot_counter.setAccessible(true);
        name.setAccessible(true);
        age.setAccessible(true);
        loot_counter.set(e, 999);
        name.set(e, "Udo");
        age.set(e, 3);
        return e;
    }
}
