package Dz_1007.task1;

/*
у телефона есть след свойства

модель  - строка (инициализация через констурктор)
цена - число инт - (инициализация через конструктор)

карта памяти - (создается внутри класса объем любой)
батарея - (создается внутри класса объем любой)
для этого  нужно реализовать классы

у каждого телефона есть внутренний класс microSd(с полем объем памяти)

у каждого телефона есть метод информация о батарее ( локальный класс батарея с полями емкость)

 */
public class Phone {
    private String model;
    private int price;


    public Phone(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public static class MicroSd {
        private int microSd;

        public MicroSd() {
            this.microSd = 16;
            System.out.println("Объем памяти: " + microSd);


        }
        public int getMicroSd() {
            return microSd;
        }

        public void setMicroSd() {
            this.microSd = microSd;
        }

    }

    public void info () {
        class Battery {
            private String volumeBattery;

            public String getVolumeBattery() {
                return volumeBattery;
            }

            public void setVolumeBattery(String volumeBattery) {
                this.volumeBattery = volumeBattery;
            }


            public Battery() {
                this.volumeBattery = "90%";
                System.out.println("Объем батареи: " + volumeBattery);


            }
        } Battery battery = new Battery();
    }
}



