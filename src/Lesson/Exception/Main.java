package Lesson.Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ввести число");


        boolean state = false;
        try (Scanner in = new Scanner(System.in);){
            int a = in.nextInt();
            int b = in.nextInt();
            state = true;
            System.out.println(" соединение с бд " + state);
            System.out.println("данные загруженны");
            System.out.println((a/b));

        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println( e.getStackTrace()[0].getClassName());
        }finally {
            state = false;
            System.out.println("завершение работы соединение " + state);
        }

        System.out.println("завершение программы");
    }
}
