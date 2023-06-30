package Dz_1606.composition;

/*
создать пакет композиция в нем
класс Человек
класс меч с названием
класс человек  у него есть имя и есть меч с названием
у каждого свой меч
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lucia", "Power300");
        Person person1 = new Person("Monica", "Power300");
        person.sword.name = "Shadow";
        System.out.println(person1.name + " " + person1.sword.name);
        System.out.println(person.name +  " " + person.sword.name);
    }
}
