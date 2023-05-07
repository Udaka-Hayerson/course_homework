package java_professional.lesson_notes.fifteenth_lesson.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> opt1 = Optional.ofNullable(null);
        Optional<Integer> opt2 = Optional.empty();
        Optional<Integer> opt3 = Optional.of(1);

        System.out.println(opt1);
        System.out.println(opt2);
        System.out.println(opt3);

        String str;
        if(getString().isPresent()){//str = getString().get();
            str = getString().orElseGet(String::new);
            System.out.println(str);
        }
        str = getString().orElse(null);
        Stream.of(str).forEach(System.out::println);

        str = getString().orElseThrow(null);
        Stream.of(str).forEach(System.out::println);

    }
    public static Optional<String> getString(){
        if(true){
            return Optional.of("Simple value");
        }
        return Optional.empty();
    }
}
