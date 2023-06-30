package Dz_1606.aggregation;

/*
создать пакет агрегация в нем
класс Человек
класс меч с названием
класс человек у него имя и есть меч с названием
в маине создать 2 человека и 1 меч на двоих
 */
public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword("S grade");
        Person person = new Person("Орландо", sword);
        Person person1 = new Person("Джон Уик", sword);//тту допиши
        System.out.println(person1.sword.name);
    }
}

