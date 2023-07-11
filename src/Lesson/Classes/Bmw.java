package Lesson.Classes;

public class Bmw {
    private String model;
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void info(){
        engine.info();
    }

    public int getPower() {
        return engine.getHorsePower();
    }

    public Bmw(String model, int horsePower) {
        this.model = model;
        this.engine = new Engine(horsePower);
    }



    private class Engine{
        private String model;

        private int horsePower;

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;

        }

        public int getHorsePower() {
            return horsePower;
        }

        public void  info(){
            System.out.println("power = " + horsePower);
            System.out.println("model " + model);
            System.out.println("model auto " + Bmw.this.model);
        }

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            this.model = "V12";

        }
    }
}
