package java_professional.lesson_notes.fifteenth_lesson.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> collect = Arrays.asList(10, -20, 30, 50, 30, 40, 80, 60, 70, 20, 0, -10)
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(10, -20, 30, 50, 30, 40, 80, 60, 70, 20, 0, -10);
        String[] s = {"Ary" ,"Mary", "Tom", "Jerry", "Udo"};
        Stream<String> stringStream = Arrays.stream(s);
        Stream.builder()
                .add(10)
                .add(20)
                .add(30)
                .add(40)
                .add(50)
                .build();
        IntStream chars = "hayerson".chars();
        /*
         conveyor operations:
              map, filter, distinct, parallel, sequeential, flatMap, skip, limit
         terminal operation:
              forEach, collect, min/max/sum/count, matcher(anyMatch, allMatch),
              findFirst, findAny, iterator
         */

    }
}
