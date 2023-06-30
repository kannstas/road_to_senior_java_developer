package Lesson;

import java.util.Scanner;

public class LessonWhile {
    public static void main(String[] args) {
        int count = 1;
        System.out.println(++count);

        while (true){
            if(count > 10){
                break;
            }
            System.out.println("hello " + count);
            count++;

        }

        int count2 = 0;
        while (count2 <= 10){
            System.out.println("hello2 " + count2);
            count2++;
        }
        int oneToHundred = 1;
        while ( oneToHundred <= 100){
            System.out.print(oneToHundred + " ");
            oneToHundred++;
        }

        System.out.println ();

        int zeroToHundred = 0;
        while (zeroToHundred <= 100) {
            System.out.print(zeroToHundred + " ");
            zeroToHundred+=2;
        }

        System.out.println();

        Scanner in = new Scanner(System.in);
        int ball = 0;
        int c = 2;
        while (true){
            if (c > 0){
                System.out.println("Зимой и летом одним цветом ? ");
                String answer1 = in.nextLine().strip();
                if (answer1.equalsIgnoreCase("Ёлка") || (answer1.equalsIgnoreCase("Елка"))){
                    System.out.println("Верно, теперь ваш баланс = " +  ++ball);
                    break;
                }else {
                    c--;
                    if (c != 0) {
                        System.out.println("Неверный ответ, попробуйте ещё раз попыток осталось " + c);
                    }
                }
            }else {
                System.out.println("Вы потратили все попытки");
                break;
            }
        }

        c =2;
        while (true) {
            if (c > 0 ) {
                System.out.println("Висит груша, нельзя скушать");
               String answer2 = in.nextLine();
               if (answer2.equalsIgnoreCase("Лампочка")) {
                   System.out.println("Вы молодец, теперь ваш балл " + ++ball);
                   break;
                }else {
                   c--;
                   if (c != 0) {
                       System.out.println("Ответ неверный, попробуйте еще раз, попыток " + c);
                   }
               }
            }else{
                System.out.println("Попытки закончились");
                break;
            }
        }





    }
}
