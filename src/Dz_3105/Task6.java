package Dz_3105;

public class Task6 {
    public static void main(String[] args) {
        int[] numbers = {354, 99, 712, 820, 180, 463, 523, 950, 561, 146, 289, 626, 497, 615, 378, 137, 834, 602, 52, 303, 871, 245, 648, 1000, 416, 207, 727, 467, 765, 929, 638, 834, 314, 264, 719, 955, 173, 220, 381, 947, 893, 35, 682, 771, 817, 431, 89, 270, 416, 583};
       int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers [i]) {
                max = numbers [i];
            }
        }
        System.out.println("Максимальное число: " + max);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]){
                min = numbers[i];
            }
        } System.out.println("Минимальное значение: " + min);

    }

}

