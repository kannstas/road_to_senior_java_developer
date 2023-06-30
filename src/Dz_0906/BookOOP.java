package Dz_0906;
/*
 Создайте класс "Книга" с тремя свойствами: "название", "автор" и "год издания".
 Создайте конструктор, который принимает эти три параметра и инициализирует поля объекта.
 */
public class BookOOP {
    String name;
    String author;
    int yearOfPublication;

    public BookOOP (String name, String author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

}
