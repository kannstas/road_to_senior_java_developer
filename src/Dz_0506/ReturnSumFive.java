package Dz_0506;

/*написать метод который принимает 5 чисел и возвращает сумму этих чисел
после получить результат в маине и вывести */

//доп подумать, как сделать, чтобы пользователь сам вводил сколько цифр он хочет проссумировать//

import java.util.Scanner;

public class ReturnSumFive {
    public static void main(String[] args) {
        System.out.println("Введите 5 чисел");
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt(); // заполнил 5 ячеек
        }
        System.out.println(calculateSum(numbers));
    }
   public static int calculateSum (int [] numbers) {
      int sum = 0;;
       for (int i = 0; i < numbers.length ; i++) {
           sum+=numbers[i];
       }
       return sum;
    }
}

