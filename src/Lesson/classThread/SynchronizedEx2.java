package Lesson.classThread;

public class SynchronizedEx2 {


    public static void main(String[] args) {


        Thread thread = new Thread(new MyRunnable1("яйцо"));
        Thread thread1 = new Thread(new MyRunnable1("Курица"));

        thread1.start();
        thread.start();
    }
}

class MyRunnable1 implements Runnable {
    String text;

    public MyRunnable1(String text) {
        this.text = text;
    }

    @Override
    public void run() {
       Work.printText(text);
    }
}

class Work{
    public static synchronized void printText(String text){
        for (int i = 0; i < 10; i++) {
            System.out.println("Первыйм появилось " + text + " "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}

