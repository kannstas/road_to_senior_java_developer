package Dz_2206;

import java.util.Arrays;
import java.util.Scanner;

public class Terminal {
    Student student;

    public Terminal(Student student) {
        this.student = student;
    }

    Scanner in = new Scanner(System.in);

    public void start() {

        block1:
        while (true) {
            System.out.println(" Студент:" + student.getName());
            System.out.println(" 1 Изменить возраст. Текущий возраст: " + student.getAge());
            System.out.println(" 2 Изменить группу. Текущая группа:" + student.getGroup());
            System.out.println(" 3 Посмотреть оценки студента - " + student.getName());
            System.out.println(" 4 Посмотреть снаряжение студента ");
            System.out.println(" 0 выйти");

            String answer = in.nextLine();
            switch (answer) {
                case "1" -> {
                   changeAge();
                }
                case "2" -> {
                 changeGroup();
                    }
                case "3" -> {
                  showScores();
                }
                case "4" -> {
                    showBackpack();
                }
                case "0" -> {
                    break block1;
                }
            }
        }
    }

    public void changeGroup() {
        System.out.println("Введите группу, в которую желаете перевестись:");
        int group = in.nextInt();
        in.nextLine();
        if (group > 0 && group <= 5) {
            student.setGroup(group);
            System.out.println("Ваша группа изменена: " + student.getGroup());
        } else {
            System.out.println("Ваша группа не может быть изменена");
        }
    }
    public void changeAge () {
        System.out.println("Вы хотите изменить возраст. Введите число, на которое вы хотите изменить текущий возраст");
        int answer = in.nextInt();
        in.nextLine();
        if (answer == 1) {
            student.setAge(student.getAge() + answer);
            System.out.println("Ваш возраст изменен на: " + student.getAge());
        } else {
            System.out.println("Невозможно изменить возраст");
        }
    }
    public void showScores () {
        student.getScore();
        System.out.println(Arrays.toString((student.getScore())));
       /*  int result = in.nextInt();
        in.nextLine();
        for (int i = 0; i < student.getScore().length; i++) {
            student.getScore()[i] += result;
            System.out.println(result);

            ХОТЕЛА СДЕЛАТЬ, ЧТОБЫ ИЗ КОНСОЛИ НАБИРАЛОСЬ, НО НЕ ВЫШЛО
        */
            }
            public  void showBackpack () {
                System.out.println(student.getBackpack().getName() + " " + student.getBackpack().getWeight());
            }

        }



