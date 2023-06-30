package Dz_0906;
/*
  Создайте класс "Автомобиль" с тремя свойствами: "марка", "модель" и "год выпуска".
  Создайте конструктор, который принимает эти три параметра и инициализирует поля объекта.
 */
public class CarOOP {
    String carBrand;
    String model;
    int releaseYear;

    public CarOOP (String carBrand, String model, int releaseYear) {
        this.carBrand = carBrand;
        this.model = model;
        this.releaseYear = releaseYear;
    }
}
