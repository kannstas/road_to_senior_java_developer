package Lesson.Classes.LocalClass;

public class Store {
    private Product [] products = new Product[100];


    public void addProducts (Product product) {
        for (int i = 0; i < products.length ; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }


    public void printCheque () {
        class Check {
         private int sum = 0;

            public int getSum() {
                return sum;
            }

            public String calculation (){
                StringBuilder stringBuilder = new StringBuilder();
                for (Product product : products) {
                    if (product != null) {
                        stringBuilder.append(product.getName()).append(" ").append(product.getPrice()).append("руб").append("\n");
                        sum += product.getPrice();
                    }
                }
             return stringBuilder.append("Цена за все товары " + sum).toString();
            }
        }

        Check check = new Check();
        System.out.println(check.calculation());
    }
}
