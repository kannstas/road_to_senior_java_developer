package Dz_1906.furniture;

/*
Создать иерархию наследования след
есть классы стол стул кровать  комод сделать им супер класс
у супер класса будут поля высота ширина и вес и цена и тип мебели(стол стул итд)

добавить данные объекты в массивы  и вывести все объекты
 */
public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair(35, 14, 5, 30);
        Bed bed = new Bed(33, 22, 21, 59);
        Chest chest = new Chest(212, 21, 121, 333);
        Table table = new Table(313, 1221, 333, 1111);


        Furniture[] stuff = {chair, bed, chest, table};
        for (int i = 0; i < stuff.length; i++) {
            System.out.println(stuff[i].name);

        }
        //System.out.println(Arrays.asList(stuff));

    }

}
