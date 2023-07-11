package Lesson.Classes;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("x7",500);
        bmw.info();
        System.out.println(bmw.getPower());

       // Bmw.Engine engine = bmw.new Engine(200);

        // engine.setHorsePower(900);
       // System.out.println(engine.getHorsePower());
       // System.out.println(bmw.getEngine().getHorsePower());

      //  engine.info();
    }
}
