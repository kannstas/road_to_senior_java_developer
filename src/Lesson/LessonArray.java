package Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class LessonArray {
    public static void main(String[] args) {
        int n = 100;
        int [] box = new int[10];

        System.out.println(box.length);
        box[0] = n;
        box[1] = 200;
        box[8] = 20000;
        box[box.length -1] = 3239234;
        System.out.println(box[8] + box[9]);


        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i] + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(box));


        String [] logins = {"Login1","Login2","Login3"};
        System.out.println(logins.length);


        int [] c = {1, 2, 3, 4, 5};
        System.out.println(c.length);

        for (int i= 0; i < c.length; i++){
            System.out.println(c[i]);
        }

        //линейный алгоритм поиска элемента в массиве // линейный поиск//
        int [] id = {67,234,12,1,53,234,54,3,24,58,5,241,25,4,21};
        Scanner in = new Scanner (System.in);
        System.out.println("Введите id (число)");
        int idPerson = in.nextInt();
        in.nextLine();

        boolean b = false;
        for (int i = 0; i < id.length; i++) {
            if (idPerson == id[i]){
                    b = true;
                break;
            }
        }

        if (b){
            System.out.println("вы оплатили подписку");
        }else {
            System.out.println("нету подписки");
        }


        String [] login = {"Anastasia", "Ivan", "Mark"};
        System.out.println("Введите логин");
        String loginName = in.nextLine();

        boolean b1 = false;
        for (int i = 0; i < login.length; i++) {
            if (loginName.equals(login[i])) {
                b1= true;
                break;
            }
        }
       if (b1){
           System.out.println("Вы авторизировались");
       }else {
           System.out.println("Вы не авторизировались");
       }



    }
}
