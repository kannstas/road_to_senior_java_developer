package Dz_0906;

public class BookTask2 {
    public static void main(String[] args) {
        BookOOP book1 = new BookOOP("Преступление и наказание", "Достоевский", 1866);
        BookOOP book2 = new BookOOP("Униженные и оскорбленные", "Достоевский", 1861);
        BookOOP book3 = new BookOOP("Лолита", "Набоков", 1955);
        BookOOP book4 = new BookOOP("Анна Каренина", "Тостой", 1833);
        BookOOP book5 = new BookOOP("Война и мир", "Тостой", 1867);
        BookOOP book6 = new BookOOP("Кабала святош", "Булгаков", 1962);
        BookOOP book7 = new BookOOP("Мастер и Маргаритта", "Булгаков", 1967);
        BookOOP book8 = new BookOOP("Том Сойер", "Твен", 1833);
        BookOOP book9 = new BookOOP("Евгений Онегин", "Пушкин", 1833);
        BookOOP book10 = new BookOOP("Герой нашего времени", "Лермонтов", 1840);


        BookOOP[] books = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
          //  oldestBook(books);
        // System.out.println(sameYear);
        sameYear(books);
        System.out.println("\n\n\n");
        nameBooks(books);

    }
  /*  создать массив книг в котором будут 10 книг
            (легкое) написать метод  который принимает массив книг и выводит названия этих книг

   */

    public static void nameBooks (BookOOP [] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].name + " " + books[i].author);
        }
    }



    /*
    (среднее) написать метод  который принимает массив книг и выводит самую старую книгу (по году издания)
     */
    public static void oldestBook(BookOOP[] books) {
        int old = books[0].yearOfPublication;
        BookOOP nameBooks = null;
        int countBook = 0;
        for (int i = 1; i < books.length; i++) {
            if (old > books[i].yearOfPublication) {
               old = books[i].yearOfPublication;
               nameBooks = books[i];
               countBook = 1;
            }else if (old == books[i].yearOfPublication){
                countBook++;
            }

        }
        if (countBook == 1) {
            System.out.println("самая старая книга " +nameBooks.name + " год " + nameBooks.yearOfPublication );

        } else {
            BookOOP [] oldBook = new BookOOP[countBook];

            for (int i = 0,j = 0; i < books.length; i++) {
                if (books [i].yearOfPublication == old){
                    System.out.println(books[i].author);
                    oldBook[j++] = books[i];

                }
            }


        }

        System.out.println("самая старая книга " +nameBooks.name + " год " + nameBooks.yearOfPublication );

    /*public static int oldestBook(BookOOP[] books) {
        int old = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].yearOfPublication > 0) {
                books[i].yearOfPublication = old;
            }

     */

    }
    /*
     написать метод  который принимает массив книг и возвращает книг какого года больше всего
     */
    public static void sameYear (BookOOP [] books) {
        int number = 0;
        int index = 0;
        int [] y = new int[books.length];

        for (int i = 0; i < books.length; i++) {
            y[i] = books[i].yearOfPublication;
        }

        for (int i = 0; i < books.length; i++) {
            int count = 0;
            for (int j = 0; j < y.length; j++) {
                if (y[j] == books[i].yearOfPublication){
                    count++;
                }
            }

            if (count > number){
                number = count;
                index = i;
            }
        }

        int year = books[index].yearOfPublication;
        for (int i = 0; i < books.length; i++) {
            if (books[i].yearOfPublication == year){
                System.out.println(books[i].name);
            }
        }


    }

}
