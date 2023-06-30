package Algorithm.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int array [] = {12, 6, 4, 1, 15, 10};
        bSort(array);

    }
    public static void bSort (int array []) {
        boolean isSorted = false;
        while (!(isSorted)) {
           isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array [i] < array [i-1]) {
                    int temp = array [i];
                    array [i] = array [i-1];
                    array [i-1] = temp;
                    isSorted = false;
                }

            }

        }
    }
}
