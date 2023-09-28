package Lesson.classThread.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Call callPhone = new Call(lock);
        Call callWA = new Call(lock);
        Call callSkype = new Call(lock);

        GoogleCall googleCall = new GoogleCall(lock);


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                callSkype.mobileCall();
            }
        });

        Thread thread2 = new Thread( () -> {callPhone.skypeCall();} );

        Thread thread3 = new Thread( () -> {callWA.whatsAppCall();});

        Thread thread4 = new Thread(() -> {googleCall.googleCall();});

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();



    }


}

class Call {

    Lock lock;

    public Call(Lock lock) {

        this.lock = lock;
    }

    public void mobileCall () {
        lock.lock();
        System.out.println("Мобильный звонок начат ");
        try {
            Thread.sleep(3000);
            System.out.println("звонок завершен");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }

    public void whatsAppCall () {
        lock.lock();
        System.out.println("WA звонок начат");
        try {
            Thread.sleep(7000);
            System.out.println("WA звонок завершен");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }


    }

    public  void skypeCall () {
        lock.lock();
        System.out.println("Skype звонок начат");
        try {
            Thread.sleep(5000);
            System.out.println("Skype звонок завершен");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
}

class GoogleCall {
Lock lock;

    public GoogleCall(Lock lock) {
        this.lock = lock;
    }

    public void googleCall () {
        lock.lock();
        System.out.println("Google call начат ");
        try {
            Thread.sleep(3000);
            System.out.println("звонок завершен");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
}

