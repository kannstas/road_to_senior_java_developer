package Lesson.CountDownLatchEx;

import java.util.concurrent.CountDownLatch;

public class Main {
    static CountDownLatch countDownLatch = new CountDownLatch(2);
    public static void main(String[] args) {
        new User("anna", countDownLatch);
        new User("anna2", countDownLatch);
        new User("anna3", countDownLatch);
        new User("anna4", countDownLatch);
        new User("anna5", countDownLatch);

        marketStuffIsOnPlace();
        openMarket();

    }

   public static void marketStuffIsOnPlace () {
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       System.out.println("Персонал вышел на работу");
       countDownLatch.countDown();
   }

   public static void openMarket () {
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       System.out.println("Магазин открыт");
       countDownLatch.countDown();
   }


} class User extends  Thread {
    String name;
    CountDownLatch countDownLatch;

    public User(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " приступил к покупкам");

    }
}


