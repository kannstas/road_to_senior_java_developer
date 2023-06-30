package Dz_1906.furniture;

/*
у супер класса будут поля высота ширина и вес и цена и тип мебели(стол стул итд)
 */
public class Furniture {
    String name;
    double height;
    double width;
    double weight;
    double price;


    public Furniture(double height, double width, double weight, double price,String name) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
    }

}
