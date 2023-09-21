package Dz_2109;

public class Main {
    public static void main(String[] args) {


       Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Weather.weatherInMoscow();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

       Thread thread1 = new Thread () {
           @Override
           public void run() {
               try {
                   Weather.weatherInKrasnodar();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       };

       Thread thread2 = new Thread() {
           @Override
           public void run() {
               try {
                   Weather.weatherInRostov();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       };


       thread.start();
       thread1.start();
       thread2.start();
    }


    class Weather {


        public static synchronized void weatherInRostov() throws InterruptedException {

            for (int i = 0; i < 10; i++) {
                System.out.println("Погода в Ростове " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }

        public static synchronized void weatherInKrasnodar() throws InterruptedException {
            for (int i = 0; i < 10; i++) {
                System.out.println("Погода в Краснодаре " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }

        public static synchronized void weatherInMoscow() throws InterruptedException {

            for (int i = 0; i < 10; i++) {
                System.out.println("Погода в Москве " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }

        }
    }
}
