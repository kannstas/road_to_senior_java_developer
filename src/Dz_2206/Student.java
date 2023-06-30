package Dz_2206;

import java.util.Scanner;

/*
создать объект студент с полями
имя группа возраст и массив для оценок
все поля должны бить приватные к ним реализовать геттеры и сеттеры
к имени и массиву только геттер к остальным оба метода
возраст можно изменить только на 1 больше текущего
группу на 1,2,3,4,5 (иначе не поменяется

Так же у студента должен быть свойство (объект) портфель (с полями вес и название к ним так же реализовать гетеры и сетеры)
 отношения которое будет по принципу композиции
 */
public class Student {
    private String name;
    private int group;
    private int age;
    private int[] score = new int[5];
    private Backpack backpack;


    Scanner in = new Scanner(System.in);

    public Student(String name, int group, int age, String backpackName, int backpackWeight,int[] arr) {
        this.name = name;
        this.group = group;
        this.age = age;
        this.score =arr;
        // this.score = new int[5];

        this.backpack = new Backpack(backpackName, backpackWeight);
    }

    public String getName() {
        return name;
    }

    public int[] getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Backpack getBackpack () {
        return backpack;
    }

}
