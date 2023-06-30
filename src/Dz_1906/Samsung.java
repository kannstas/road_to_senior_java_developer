package Dz_1906;

/*
написать доп метод, проверить количество памяти
 */
public class Samsung extends SmartPhone{
    public Samsung(String namePhone, double amountOfRam, double price) {
        super(namePhone, amountOfRam, price);
    }
    public Samsung(boolean state) {
        super(state);
    }

    public void CheckingTheAmountOfRam () {
        if (amountOfRam < 8 ) {
            System.out.println("В наличии нет смартфонов с таким количеством памяти");
        }
    }
}
