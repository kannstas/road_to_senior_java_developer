package Lesson.Collection.Set;

import java.util.*;

public class Menu {
    Set <Product> set = new HashSet<>();
    Scanner in = new Scanner(System.in);
    public void start () {
        while (true) {
            System.out.println("Введите название продукта");
            String answer = in.nextLine();
            if (answer.equals("exit")){
                for (Product product : set) {
                    System.out.println(product);
                }
                System.exit(0);
            }

            System.out.println("Введите цену продукта");
            double answerCost = in.nextDouble();
            in.nextLine();

            Product product = new Product(answer, answerCost);
            if (set.add(product)) {
                System.out.println("Товар добавлен");
            } else {
                System.out.println("Товар не добавлен");
            }


        }

    }

    }
