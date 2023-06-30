package Dz_0506;

/*
написать метод который ничего не принмиает и вывод сообщение работа с методами завершенна 101 раз
 */
public class MessageWorkDone {
    public static void main(String[] args) {
      printWorkDone();
    }

    public static void printWorkDone() {
        for (int i = 0; i <= 101; i++) {
            System.out.println("Работа с методами завершена");
        }

    }
}

