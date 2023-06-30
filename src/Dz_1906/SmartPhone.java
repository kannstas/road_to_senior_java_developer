package Dz_1906;
/*
Задание 1
создать класс Смартфон с полями название объем памяти(тип dooble) и цена
и метод включить смартфон и выключить смарфон методы выводят сообщение о том что смарфон включен или наоборот
конструктор который принимает все параметры при создании объекта
 */
public class SmartPhone {
    String namePhone;
    double amountOfRam;
    double price;
    boolean state;
    public SmartPhone(String namePhone, double amountOfRam, double price) {
        this.namePhone = namePhone;
        this.amountOfRam = amountOfRam;
        this.price = price;

    }
    public SmartPhone (boolean state) {
        this.state = state;
    }

    public void On () {
        state = true;
        System.out.println("Смартфон включен");
    }
    public void Off () {
        state = false;
        System.out.println("Смарфтон выключен");
    }
}
