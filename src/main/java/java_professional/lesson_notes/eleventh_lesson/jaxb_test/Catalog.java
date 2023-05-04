package java_professional.lesson_notes.eleventh_lesson.jaxb_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// xjc.exe = XML->Java , schemagen.exe Java->XML
// not work
public class Catalog {
    private List<Book> books = new ArrayList<>();
    public void add(Book book){
        books.add(book);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(books.toArray()) ;
    }
}
