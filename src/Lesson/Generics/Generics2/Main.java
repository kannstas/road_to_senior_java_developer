package Lesson.Generics.Generics2;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Employee employee = new Employee();
        User user = new User();
        Person person = new Person();
        EmployeeTwo employeeTwo = new EmployeeTwo();

        ArrayList <User> list = new ArrayList<>();
        ArrayList<EnglishSpeaking > list2 = new ArrayList<>();

        ArrayList <? super Employee> list3 = new ArrayList<>();

        //list.add(employee);
        //list.add(person);
       //list.add(employeeTwo);
         list.add(user);
        System.out.println(list);


        printHello(employee);
       // printHello(user);
      //  printHello(person);
        print(list2);
    }

    public static <T extends Person & EnglishSpeaking> void printHello( T t ) {
        t.helloRu();
        t.hello();
    }

    public static   void print (ArrayList<? extends EnglishSpeaking> list) {
        for (EnglishSpeaking englishSpeaking : list) {
             englishSpeaking.hello();

        }
    }
}
