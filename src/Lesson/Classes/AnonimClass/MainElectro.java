package Lesson.Classes.AnonimClass;

public class MainElectro {
    public static void main(String[] args) {
        Pc pc = new Pc();
        pc.info();

        ElectroItem fridge = new ElectroItem() {
            @Override
            void info() {
                System.out.println("Это холодильник");
            }
        };

        //вариант 1 создание анонимного класса с исп абстрактного класса
        ElectroItem teapot = new ElectroItem() {
            @Override
            void info() {
                System.out.println("Это чайник");
            }
        };

        //ваиант 1
        Electro electro = new Electro() {
            @Override
            public void info() {
                System.out.println("это 1");
            }
        };

        //вариант 2 создать анонимный класс исп интерфейс только если 1 метод
        Electro electro1 = () -> { System.out.println("это 2");};

        fridge.info();
        teapot.info();
        runElectroItem(pc);

        //передать в качестве параметра объект анонимного класса с исп интерфейса только если 1 метод
        runElectro(()->{
            System.out.println("это  Tv");
        });

        //передать в метод в качестве параметра объект анонимного класса с исп абстрактного класса
        runElectroItem(new ElectroItem() {
            @Override
            void info() {
                System.out.println("это ps5");
            }
        });


    }


    public static void runElectroItem(ElectroItem electroItem){
        electroItem.info();
        System.out.println("запущен");
    }
    public static void runElectro(Electro electroItem){
        electroItem.info();
        System.out.println("запущен");
    }


}
