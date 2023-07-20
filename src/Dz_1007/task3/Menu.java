package Dz_1007.task3;

import java.util.Scanner;

public class Menu {
    private Store store= new Store();
    private  Scanner in = new Scanner(System.in);
    public void startMenu() {

        start:
        while (true) {
            System.out.println("1 добавить продкут (Администратор)");
            System.out.println("2 купить продукт");
            String  answer = in.nextLine();
            if (answer.equals("1")) {
                store.addProducts(store.cteateProduct());
            } else if (answer.equals("2")) {
                store.buyProduct();
            }
        }
    }
}
