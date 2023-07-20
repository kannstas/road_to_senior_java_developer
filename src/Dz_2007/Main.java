package Dz_2007;
/*
написать 3 объекта ноутбука и создать их копии через метод clone()

класс ноутбук
с полями
model
price

и по принципу композиции следущие объекты

(Нужно будет создать класс Процессор )
объект процессор(со свойствами герцы (это тип инт) принимаются через конструктор)

(Нужно будет создать класс Процессор )
объект оперативная память (со свойствами объем памяти (это тип int) принимаются через конструктор)

(Нужно будет создать класс Процессор )
объект видеокарта (со свойствами объем памяти (это тип int) и название принимаются через конструкто
 */
public class Main {
    public static void main(String[] args) {

       Laptop laptop = new Laptop("LG", 30000, 13, 16, "GGG", 64);

       Laptop laptop1 = null;

       Laptop laptop2 = null;

       try {
           laptop1 =  (Laptop) laptop.clone();
       } catch (CloneNotSupportedException e) {
           e.printStackTrace();
       }

       try {
           laptop2 = (Laptop) laptop.clone();
       } catch (CloneNotSupportedException e) {
           e.printStackTrace();
       }

        System.out.println(laptop1.getRam().getVolumeMemory());
        System.out.println(laptop.getRam().getVolumeMemory());
        System.out.println(laptop2.getRam().getVolumeMemory());


        System.out.println(laptop1.getPrice());
        System.out.println(laptop2.getPrice());



    }
}
