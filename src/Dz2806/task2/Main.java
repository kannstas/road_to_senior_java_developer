package Dz2806.task2;

/*
напистаь класс Телефон абстрактный со свойством модельи методом позвонить

так же создать 2 интерфейса

смартфоны  и кнопочныетелефоны

напистаь класс самсунг который имплементриует смартфоны
написать класс нокиа  который  имплементриует кнопочныетелефоны
написать класс fly который  имплементриует смартфоны
и все классы наследуются от абстрактоного Телефон

создать данные объекты в маине
создать метод которая принимает любой смартфон  и вызывает у него метод запустить видео
создать метод которая принимает любой кнопочныетелефоны и вызывает у него метод запустить мелодию
создать метод которая принимает любой Телефон и вызывает у него метод позвонить

у каждого интерфейса свой метод которые реализуют классы

допольнительно
создать массив для смартфоны
создать массив для кнопочныетелефоны
создать массив для Телефоны
записать в данные масиивы по 2 -3 телефона подходящего типа
 */
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(" Iphone XR");
        Iphone iphone1 = new Iphone("Iphone 11");
        Iphone iphone2 = new Iphone("Iphone 14");
        Samsung samsung = new Samsung(" Samsung S23");
        Samsung samsung1 = new Samsung("Samsung Galaxy Z Fold 4");
        Nokia nokia = new Nokia("Nokia 100");
        Nokia nokia1 = new Nokia("Nokia 101");
        Nokia nokia2 = new Nokia("Nokia 105");

        iphone.call();
        iphone.playVideo();
        samsung.call();
        samsung.playVideo();
        nokia.call();
        nokia.playMusic();

        System.out.println();

        Smartphone[] smartphones = {iphone, iphone1, iphone2, samsung, samsung1};

        for (int i = 0; i < smartphones.length; i++) {
            smartphones[i].showImage();
            if (smartphones[i] instanceof Samsung) {
                ((Samsung) smartphones[i]).playVideo();
            }

        }
        Push_buttonPhone [] pushButtonPhones = {nokia,nokia1,nokia2};
        Phone [] phone = {iphone,nokia1,samsung, iphone2, nokia, samsung1};
    }
}



