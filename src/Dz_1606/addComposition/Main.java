package Dz_1606.addComposition;
/*
создать пакет композиция в нем
класс Человек
класс меч с названием и сила меча
класс человек  у него есть имя и есть меч с названием
у каждого свой меч
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Dima",100,"A");
        person.sword.power = 200;
        System.out.println(person.sword.power);
    }
}
