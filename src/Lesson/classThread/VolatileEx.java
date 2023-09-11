package Lesson.classThread;

public class VolatileEx  extends Thread{
volatile boolean b = true;
    @Override
    public void run() {
        long count = 0;
        while (b) {
            count++;
        }
        System.out.println("Работа завершена, count равен: " + count);

    }
}


class Main7{
    public static void main(String[] args) throws InterruptedException {
        VolatileEx volatileEx = new VolatileEx();
        volatileEx.start();

        Thread.sleep(3000);
        System.out.println("Main проснулся, останавливаем поток " + volatileEx.getName());
        volatileEx.b = false;

        volatileEx.join();
        System.out.println("работа завершена");
    }
}


