package Lesson.classThread;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Thread thread = new Thread(employee);
        Thread thread1 = new Thread(employee);

        thread.start();
        thread1.start();

        System.out.println("маин завершил работу и ждет thread");

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("программу завершила работу");

    }
}
