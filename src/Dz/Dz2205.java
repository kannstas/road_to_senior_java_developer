package Dz;


// задание 1
public class Dz2205 {
    public static void main(String[] args) {
        boolean value = 100 < 100;
        System.out.println(value);

// задание 2
        String j = "Петя";
        String j1 = new String("Петя");

        if (j == j1) {
            System.out.println("Вы Петя");
        } else {
            System.out.println("Вы не Петя");
        }
/* некорректно использовать ==,
поскольку if сравнивает ссылочный тип данных по ссылкам, а не по содержанию,
чтобы этого избежать необходимо использовтаь метод equals()
 */

        // задание 3

        float h = 234.0f;
        float h1 = 534.6f;
        float h2 = 116.782f;
        float h3 = 5558.13f;
        float h4 = h + h1 + h2 + h3;

        int h5 = (int) h4;
        System.out.println("Cумма float:" + h5);

        // задание 4

        String e = "70";
        String e1 = "100";

        int e2 = Integer.parseInt(e);
        int e3 = Integer.parseInt(e1);

        System.out.println("Сумма String:" + (e2 + e3));


// задание 5

        String s = "Аня";
        short s1 = 2002;
        System.out.println(s + " " + (2023 - s1) + " " + "год");


        // задание 6

        String t = "Мурманск";
        String t1 = "Белгород";

        if (t.equals(t1)) {
            System.out.println("Вы из одного города, вы не можете купить билет");
        } else if (t.equalsIgnoreCase("Мурманск") || (t1.equalsIgnoreCase("Мурманск"))) {
            System.out.println("В данный город и из этого города поезда временно приостановлены");
        } else {
            System.out.println("Вы купили билет");
        }
    }

}











