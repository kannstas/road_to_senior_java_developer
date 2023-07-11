package Lesson.Classes.LocalClass;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProducts(new Product("Dirol",90));
        store.addProducts(new Product("Cake",500));
        store.addProducts(new Product("Carrot",13));
        store.addProducts(new Product("Milk",190));

        store.printCheque();
    }
}
