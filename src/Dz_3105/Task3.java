package Dz_3105;

public class Task3 {
    public static void main(String[] args) {
        int [] box = new int [100];
        box [0] = 100;
        box [box.length- 1] = 10;
        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i] + " ");
        }
        System.out.println();
        System.out.println(box.length);


    }
}
