package oop_itvdn.first_lesson.book;

//    Используя IDEA, создайте проект c пакетом.
//            Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
//    содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
//    названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
//    книги, имя автора и Содержание.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Book {


    private Title title;
    private Author author;
    private Content content;


    public static String enter_Title_or_Author_or_Content(String type_enter) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter "+type_enter);
        String enter = reader.readLine();
        return enter;
    }

    public Book() throws Exception {
        this.title = new Title(Book.enter_Title_or_Author_or_Content("title"));
        this.author = new Author(Book.enter_Title_or_Author_or_Content("author"));
        this.content = new Content(Book.enter_Title_or_Author_or_Content("content"));
    }

    public Book(Title title, Author author, Content content) throws Exception {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public static void main(String[] args) throws Exception {

        Book book = new Book();
        Title title = new Title(Book.enter_Title_or_Author_or_Content("title"));
        Author author = new Author(Book.enter_Title_or_Author_or_Content("author"));
        Content content = new Content(Book.enter_Title_or_Author_or_Content("content"));
        book.title.show();
        book.author.show();
        book.content.show();

        Book magazine = new Book(title, author, content);
        magazine.title.show();
        magazine.author.show();
        magazine.content.show();

    }
}
