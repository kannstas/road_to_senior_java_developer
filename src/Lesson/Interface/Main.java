package Lesson.Interface;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("x5");
        Lada lada = new Lada("Vesta");
        Mangal mangal = new Mangal();
        MetalStore metalStore = new MetalStore();
        metalStore.acceptMetal(bmw);
        h1(bmw);

    }

    public static void  h1 (SportCar sportCar) {
        sportCar.info();
        sportCar.hello();

    }

}
