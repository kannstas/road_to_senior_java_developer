package Dz_2405;


import java.util.Scanner;

public class ReplacingText {
    public static void main(String[] args) {
        String text = "    Привет София,как это приложения поможет тебе научиться программировать,Для начала давай познакомимся,      тебя зовут София это мне понятно но меня зовут Робот,вот и познакомились   и так для того чтобы начать программу тебе потребуется аккаунт       ";
        System.out.println(text.replace("София", "Анастасия"));
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

     Scanner in = new Scanner(System.in);
        String change = in.nextLine();
        System.out.println((text.replace("Робот", change.trim())));
        System.out.println(text.charAt(text.length() - 1 ));

        String newText = (text.trim());
        System.out.println(newText.lastIndexOf("т"));

        System.out.println(newText.charAt(newText.length() - 1));
        System.out.println(newText.startsWith("Привет"));


    }

}
