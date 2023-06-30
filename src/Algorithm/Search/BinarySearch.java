package Algorithm.Search;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {1, 2, 4, 6, 10, 12, 18, 20, 33, 100};
        System.out.println(bSearch( array, 100));
    }
    public static int bSearch ( int array [], int finalNumber) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        while (startIndex <=endIndex) {
            middleIndex = (startIndex + endIndex) / 2;

            if (array [middleIndex]  == finalNumber) {
                return middleIndex;
            }else if (array [middleIndex] < finalNumber) {
                startIndex = middleIndex + 1;
            }else if (array [middleIndex] > finalNumber) {
                endIndex = middleIndex - 1;
            }

        }
        return -1;

        }
    }

