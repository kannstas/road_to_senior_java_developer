package Dz_2206;

/*
создать объект студент с полями
имя группа возраст и массив для оценок
все поля должны бить приватные к ним реализовать геттеры и сеттеры
к имени и массиву только геттер к остальным оба метода
возраст можно изменить только на 1 больше текущего
группу на 1,2,3,4,5 (иначе не поменяется)

Так же у студента должен быть свойство (объект) портфель (с полями вес и название к ним так же реализовать гетеры и сетеры)
 отношения которое будет по принципу композиции
 */
public class Main {

    public  static void main (String [] args ) {

        Student student = new Student("Вася", 1, 23, "The North Face", 3,new int[]{4,5,5,3,4});
        Terminal terminal = new Terminal(student);
        terminal.start();
    }
    // не получилось: создать массив, который заполнялся бы их консоли и передавался в конструктор; текст, если находился в while, повторялся дважды 
}
