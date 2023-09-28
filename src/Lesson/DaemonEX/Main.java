package Lesson.DaemonEX;

public class Main {
    public static void main(String[] args) {
      Flow1 flow1 = new Flow1();
      Flow2 flow2 = new Flow2();
      flow2.setDaemon(true);

      flow1.start();
      flow2.start();
    }
}

class Flow1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("работает " + getName() + " " + isDaemon());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Flow2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "работает поток " + getName()  + " " + isDaemon());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

