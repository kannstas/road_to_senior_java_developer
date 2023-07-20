package Lesson.ClassObject.Clone;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", 23, 3);
        try  {
            Student student1  = (Student) student.clone();
            student.setAge(20);
            System.out.println(student1.getAge());
        }catch (CloneNotSupportedException e)  {
            e.printStackTrace();
        }

        Bmw bmw = new Bmw("X4", new Engine(100),new MediaPlayer("Panasonic"));
        Bmw bmw1 = null;
       try {
           bmw1 = (Bmw) bmw.clone();
       } catch (CloneNotSupportedException e) {
           e.printStackTrace();
       }

        System.out.println(bmw.hashCode() == bmw1.hashCode());
        bmw.getEngine().setLs(0);
        System.out.println(bmw.hashCode() == bmw1.hashCode());

       bmw.info();
       bmw1.info();


    }
}
