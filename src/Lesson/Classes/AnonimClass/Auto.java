package Lesson.Classes.AnonimClass;

public abstract class Auto {
    private String model;
   private Engine engine;

    public Auto(String model,int ls) {
        this.model = model;
        this.engine = new Engine(ls);
    }

    public Engine getEngine() {
        return engine;
    }

    public static class Engine {
        private int ls;

        public Engine(int ls) {
            this.ls = ls;
        }

        public int getLs() {
            return ls;
        }
    }



    public int infoExpenditure () {
       return engine.ls / 55 +10;

    }
}
