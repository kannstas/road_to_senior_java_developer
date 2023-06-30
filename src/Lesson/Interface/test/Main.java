package Lesson.Interface.test;

public class Main {
    public static void main(String[] args) {
        Lada lada = new Lada();
        Lada lada1 = new Lada();
        Bmw bmw = new Bmw();
        Bmw bmw1 = new Bmw();
        Mercedes mercedes = new Mercedes();
        Mercedes mercedes1 = new Mercedes();

        Taxi[] autoTaxi = {bmw, bmw1, lada1, lada};
        aggTaxi(autoTaxi);
        String [] arr = "wefwefwe".split("");
    }

        public static void aggTaxi (Taxi[]autoTaxi){
            for (Taxi taxi : autoTaxi) {
                taxi.start();
            }
        }
    }

