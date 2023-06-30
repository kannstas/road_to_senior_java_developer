package Dz_1606.addAggregation;
/*
создать пакет агрегация в нем
класс Человек
класс меч с названием и сила меча
класс человек у него имя и есть меч с названием
в маине создать 2 человека и 1 меч на двоих
 */
public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword( "Fire", 556);
        Person person1 =  new Person("Moon", sword);
       System.out.println(person1.sword.power);
    }
}
