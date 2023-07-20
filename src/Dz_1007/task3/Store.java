package Dz_1007.task3;

import java.util.Scanner;

/*
дз 2
создать объект магазина с массивом продуктов
продукт это внутренний класс с полем цена
так же в магазине есть метод покупка в которой пользователь вводит название товара и он выводит вы купили товар если он был в массиве
так же данный метод выводит после покупки чек
чек это объект локального класса котороый создан внутри метода продажи товаров
у данного объекта будет свойство цена чека и название товара и номер чека
 */
public class Store {

    Product[] products = new Product[100];
    Product[] basket = new Product[100];
    private  Scanner in = new Scanner(System.in);

    public Store() {
        addProducts(new Product("Milk", 134));
        addProducts(new Product("Potato", 30));
        addProducts(new Product("Chocolate", 150));
        addProducts(new Product("Ice cream", 200));
        addProducts(new Product("Coffee", 500));
        addProducts(new Product("Pizza", 350));

    }


    public Product cteateProduct(){
        System.out.println("введите название");
        String title = in.nextLine();
        int price = in.nextInt();
        Product product = new Product(title,price);
        return product;
    }
    public void addProducts( Product product) {
        for(int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }

        }
    }


    public class Product {
        String name;
        int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }


        public int getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;

        }
    }

    public void showProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i]!= null) {
                System.out.println(products[i].getName()+" " + products[i].getPrice());
            }

        }
    }

    public void addToBasket(Product product) {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i] = product;
                break;
            }

        }
    }

    public void buyProduct() {

        buy:
        while (true) {
            System.out.println("Введите название товара, который вы хотите купить");
            showProducts();

            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();

            boolean  b = false;
            for (int i = 0; i < products.length; i++) {
                if (products[i]!=null) {
                    if (answer.equals(products[i].getName())) {
                        System.out.println("Вы купили " + products[i].getName() + " " + products[i].getPrice());
                        addToBasket(products[i]);
                        b = true;
                        break;
                    }
                }
            }

            if (!b){
                System.out.println("това не найден");
            }

            System.out.println("продолжить покупки?");
            System.out.println("1 da");
            System.out.println("2 no");
            if (in.nextLine().trim().equals("2")) {
                break buy;
            }
        }

        class Check {
            static int numberOfBill = 0;
            private int sum;

            void printCheck() {
                System.out.println("оплаченно");
                for (Product product1 : basket) {
                    if (product1 != null) {
                        System.out.println(product1.getName() + " " + product1.getPrice() + " rub");
                        sum += product1.getPrice();
                    }
                }
                System.out.println("итог " + sum);
            }

        }

        Check check = new Check();
        check.printCheck();

    }

  /*
    public void printBill () {
    class Bill {
            static int numberOfBill = 0;
            String nameOfProduct;
            int costProduct;
            Product product;

            public Bill(String nameOfProduct, int costProduct, Product product) {
                this.nameOfProduct = nameOfProduct;
                this.costProduct = costProduct;
                this.product = product;
            }
        }
        Bill bill = new Bill();
        System.out.println( "чек " + bill.nameOfProduct);


   */


}



