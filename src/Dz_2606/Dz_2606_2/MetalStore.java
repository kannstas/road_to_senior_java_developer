package Dz_2606.Dz_2606_2;

import Lesson.Interface.SportCar;

/*
класс меню
создать объекты провод штанга алюминивый кувшин
запустить метод в металобазе который принимает любой метал и возвращает сумму

создать класс металобаза
с методом который принимает любой метал и возвращает сумму цена за 1 кг метала 20 руб

создать класс провод штанга алюминивый кувшин наслудются от классса металолом
создать класс металолом  с полями вес и тип (тоесть алюминь медь или чер мет)
 */
public class MetalStore {
    ScrapMetal scrapMetal;
    public void calculateThePrice(ScrapMetal scrapMetal) {
        double sum = 0;
        String type = scrapMetal.getTypeOfMetal();
        if (type.equalsIgnoreCase("Алюминий")){
            sum = scrapMetal.getWeight() * 70;
        }else if (type.equalsIgnoreCase("Железо")) {
            sum = scrapMetal.getWeight()*50;
        }else if (type.equalsIgnoreCase("Медь")) {
            sum = scrapMetal.getWeight()*30;
        }else {
            sum = scrapMetal.getWeight()*20;
            System.out.println(SportCar.s);
        }

        System.out.println("За предоставленный вами металл, вы получите:  " + sum + "  руб");

    }
    }


