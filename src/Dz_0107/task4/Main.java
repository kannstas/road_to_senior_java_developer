package Dz_0107.task4;
/*
1 Задание
написать класс Електро товар абстрактный со свойствами название товара и цена
создать в маине 5 товаров и у каждого вывести метод инфо который воводит название и цену товара
после вывести их кол во(вызвав у класса Електро метод который выводит их кол во)
 */
public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge("Холодильник Электролюкс", 40_500);
        Laptop laptop = new Laptop("Ноутбук Macbook", 110_000);
        Smartphone smartphone = new Smartphone("Телефон Айфон", 99_100);
        Stove stove = new Stove("Плита Bocsh", 60_000);
        Teapot teapot = new Teapot("Чайник Bosch", 25_000);

        fridge.info();
        laptop.info();
        smartphone.info();
        stove.info();
        teapot.info();

        System.out.println("Количество электроприборов: " + ElectricalGoods.count);
    }
}
