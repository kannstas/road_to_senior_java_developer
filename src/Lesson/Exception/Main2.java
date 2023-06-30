package Lesson.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Ввести число");
        Scanner in = new Scanner(System.in);
      try {
          int a = in.nextInt();
          int b = in.nextInt();
          System.out.println((a+b));
      } catch (InputMismatchException e) {
          System.out.println("Неверно введены числа на строке:  " + e.getStackTrace()[4].getLineNumber());
          System.out.println("Исключение в методе:  " + e.getStackTrace()[4].getMethodName());

          e.printStackTrace();



      }

    }

}
