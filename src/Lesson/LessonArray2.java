package Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class LessonArray2 {
    public static void main(String[] args) {
        String [] s = new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(s));

        while (true){
            System.out.println("введите логин для записи в массив  или 0 для выхода");
            String login = scanner.nextLine();
            if (login.equals("0")){
                break;
            }

            boolean b = false;
            for (int i = 0; i < s.length; i++) {
                if (s[i] == null){
                    s[i] = login;
                    b = true;
                    System.out.println("логин добавлен");
                    break;
                }
            }
            if (!b){
                System.out.println("нет места в массиве");
            }
        }

        System.out.println(Arrays.toString(s));


        int [] id = {67,234,12,1,53,234,54,3,24,58,5,241,25,4,21};
        int sum = 0;

        for (int i = 0; i < id.length; i++) {
            sum += id[i];
        }

        int [][] arr = new int[5][3];

        arr[4][2] = 10;
        arr [3][2] = 9;
        arr [2][2]= 8;
        arr [0][1] = 2;
        System.out.println(Arrays.deepToString(arr));

        System.out.println(sum);

        int[][] arr2 = { {10,20,30},{99},{5,6,7,8,9} };
        System.out.println(arr2[1][0] + arr2[2][3]);

        int [][] arr3 = {{7,11,13}, {8}, {9}, {10,12,14}};
        System.out.println( Arrays.deepToString(arr3));
    }
}
