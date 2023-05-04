package java_professional.lesson_notes.fifth_lesson;

public class SimpleStringConcatenation {
    public static void main(String[] args) {

        String str = "hi wifi";
        String ss = str + str; // під капотом перетворюється в те як ініціалізується s_s \/
        String s_s = new StringBuilder().append(str).append(str).toString();
        // для перевірки декомпілиться файл - open in - explorer - cmd - cm full path - javac Class.java - javap Class.class - javap -c Class.class
        // invokevirtual Method java/lang/StringBuilder. append: (Ljave/lang/String; )Ljava/lang/StringBuilder;
        // invokevirtual Method java/lang/StringBuilder. append: (Ljave/lang/String; )Ljava/lang/StringBuilder;


    }
}
