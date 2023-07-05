package Lesson.Exception;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите сумму для перевода");
        int sum = in.nextInt();
        if (sum <= 0) {

            try {
                throw new EnteringNegativeNumberException();
            }catch (EnteringNegativeNumberException e){
                e.printStackTrace();
                System.out.println("вы ввели не верную сумму");
            }

        }
        in.nextLine();
        System.out.println("завершение работы");
    }
}
