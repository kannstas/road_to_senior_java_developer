package Lesson.Interface;

public interface SportCar {
    int s = 10;
    void info();

    default void hello(){
        System.out.println("Hello");
    }
}
