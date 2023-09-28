package Lesson.classThread.WaitNotifayNotifayAll;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        new Consumer(market);
        new Provider(market);


    }
}

class Market {

    private int smartCount;

    public synchronized void getSmartphone() {
        System.out.println("Попытка купить смартфон");
        while (smartCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        smartCount--;
        System.out.println("Покупатель купил смартфон, их оставлось: " + smartCount);
        notify();
    }

    public synchronized void  putSmartphone() {
        while (smartCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        smartCount++;
        System.out.println("Поставщик поставил телефон, их осталось: " + smartCount);
        notify();
    }
}


class Consumer extends Thread {
    Market market;

    public Consumer(Market market) {
        this.market = market;
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getSmartphone();

        }
    }
}

class Provider extends Thread {
    Market market;

    public Provider(Market market) {
        this.market = market;
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putSmartphone();
        }
    }
}

