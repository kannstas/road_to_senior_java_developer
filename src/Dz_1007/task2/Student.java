package Dz_1007.task2;

/*
дз 1 создать объект студент  и у него может быть портфель и ноутбук
портфель и ноутбук внутренние классы с 2-3 полями(придумать им свойства) так же у портфеля есть массив строк(что в нем находится)
в маине создать объект студента и вывести поля ноутбука и содержимое портфеля
 */
public class Student {
    private Backpack backpack;
    private Laptop laptop;


    public void info() {
        laptop.info();//Cannot invoke "Dz_1007.task2.Student$Laptop.info()" because "this.laptop" is null
        backpack.info();

    }

    private class Backpack {
        private String name;
        private String colour;
        private int weight;

        private String[] contents = {"Ручка", "пенал", "телефон"};

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String[] getContents() {
            return contents;
        }

        public void setContents(String[] contents) {
            this.contents = contents;
        }

        public Backpack() {
            this.name = "Ранец";
            this.colour = "розовый";
            this.weight = 15;
        }

        public  void info () {
            System.out.println("Название рюкзака " + backpack);
            System.out.println("Цвет " + colour);
            System.out.println("Вес " + weight);
            System.out.println("Содержимое " + contents);
        }

    }

    private static class Laptop {
        private String model;
        private int memory;

        public Laptop() {
            this.model = "Макбук";
            this.memory = 256;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void info() {
            System.out.println("модель " + model);
            System.out.println("память " + memory);
            ;
        }
    }

}
