package Dz_1906;
/*
Задание 2
создать 3 класса
самсунг (дописать доп метод проверить кол во памяти)
айфон
ксяоми
классы должны наследоваться от класса смарфон
далее создать все объекты в классе маин и вызвать у них методы включить и выключить
 */

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhoneState = new SmartPhone(true);
        SmartPhone smartPhone = new SmartPhone("Iphone", 8 , 500);
        SmartPhone smartPhone1 = new SmartPhone("Iphone", 6, 513);
        SmartPhone smartPhone2 = new SmartPhone("Iphone", 16, 670);

        smartPhone.Off();
        smartPhone1.Off();
        smartPhone2.On();
        System.out.println();
////

        Iphone iphone = new Iphone("XR", 12, 400);
        Samsung samsung = new Samsung( "S23",6, 300);
        Xiaomi xiaomi = new Xiaomi( "Mi A3", 16, 400);
        samsung.CheckingTheAmountOfRam();
        System.out.println();
        iphone.Off();
        samsung.On();
        xiaomi.Off();

    }
}
