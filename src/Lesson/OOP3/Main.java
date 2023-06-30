package Lesson.OOP3;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("x4", 250);
        Bmw bmw2 = new Bmw("x6", 270);
        Mercedes mercedes = new Mercedes("se4", 200);
        Lada lada = new Lada("Vesta", 98);
        SportBmw sportBmw = new SportBmw("MMM", 300);

        Auto[] autos = {bmw, bmw2, mercedes, sportBmw, lada};
        String model = maxHorsePower(autos);
        System.out.println(model);
        infoAutos(autos);
       printAutos(autos);


    }

    public static void infoAutos(Auto[] autos) {
        for (int i = 0; i < autos.length; i++) {
            autos[i].info();
        }
    }

    public static void printAutos(Auto[] autos) {
        for (int i = 0; i < autos.length; i++) {
            autos[i].start();
            if (autos[i] instanceof Lada) {
                ((Lada) autos[i]).blockDoor();
            }

            if (autos[i] instanceof Bmw) {
                ((Bmw) autos[i]).openBag();
            }
        }

    }

    public static String maxHorsePower(Auto[] autos) {
        int max = 0;
        String maxModel = null;
        for (int i = 0; i < autos.length; i++) {
            if (autos[i].horsePower > max) {
                max = autos[i].horsePower;
                maxModel = autos[i].model;

            }


        }
        return maxModel;

    }


}
