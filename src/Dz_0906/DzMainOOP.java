package Dz_0906;

public class DzMainOOP {
    public static void main(String[] args) {
        PersonOOP person1 = new PersonOOP("Luka", 33);
        CarOOP car1 = new CarOOP("Porsche", "911", 2019);

    /*
 создать массив книг в котором будут 10 книг
(легкое) написать метод  который принимает массив книг и выводит названия этих книг
     */
        BookOOP book1 = new BookOOP("Преступление и наказание", "Достоевский", 1866);
        BookOOP book2 = new BookOOP("Униженные и оскорбленные", "Достоевский", 1861);
        BookOOP book3 = new BookOOP("Лолита", "Набоков", 1955);
        BookOOP book4 = new BookOOP("Анна Каренина", "Тостой", 1877);
        BookOOP book5 = new BookOOP("Война и мир", "Тостой", 1867);
        BookOOP book6 = new BookOOP("Кабала святош", "Булгаков", 1962);
        BookOOP book7 = new BookOOP("Мастер и Маргаритта", "Булгаков", 1967);
        BookOOP book8 = new BookOOP("Том Сойер", "Твен", 1833);
        BookOOP book9 = new BookOOP("Евгений Онегин", "Пушкин", 1833);
        BookOOP book10 = new BookOOP("Герой нашего времени", "Лермонтов", 1840);

        BookOOP[] books = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        System.out.println(oldestBook(books).yearOfPublication);

    }

    public static BookOOP oldestBook (BookOOP [] books) {
        int old = 0;
        BookOOP nameBooks = null;
        for (int i = 0; i < books.length; i++) {
            if (old < books[i].yearOfPublication) {
                books[i].yearOfPublication = old;
                nameBooks = books[i];
            }
        } return nameBooks;
    }

    public static void nameBooks(BookOOP[] books) {

    }


}



