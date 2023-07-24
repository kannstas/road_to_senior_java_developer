package Lesson.Generics;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Person [] persons = new Student[100];
        persons[0] = new Student("Kim",22);
       // persons[1] = new Teacher("Olever",37);

        for (Person person : persons) {
            System.out.println(person);
        }

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Jina",20));
        students.add(new Student("Lina",19));

       // ArrayList<Person> peoples = students;
       // printArrayList();
    }

    public static void printArrayList(ArrayList<Person> arrayList){
        arrayList.add(new Teacher("Zena",28));
        System.out.println(arrayList);
    }
}
