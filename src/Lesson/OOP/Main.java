package Lesson.OOP;

public class Main {
    public static void main(String[] args) {
        String s = "fdf";
        Cat cat = new Cat("пупсень", "черный", 6);
        System.out.println(cat.name + " " +  cat.colour);

        Dog dog = new Dog("bob",3);
        Dog dog1 = new Dog("ron",2);

        Person person = new Person ("Jack", 3233, 7);
        Person person1 = new Person ("Michel", 123, 10);
        Person person2 = new Person ("Fillip", 2134, 2);
        battle(person, person1);

        System.out.println(dog1.age);
        Person [] persons = {person, person1, person2};
        System.out.println(bigWinner(persons).name);

    }

    public static Person bigWinner ( Person [] persons ) {
        int max = 0;
        Person person = null;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].win > max){
                max = persons[i].win;
                person = persons[i];
            }
        }
        return person;
    }


    public static void battle (Person person1, Person person2){
        if (person1.power > person2.power) {
            System.out.println("Победитель " + person1.name);
        }else {
            System.out.println("Победитель " + person2.name);
        }
    }




}
