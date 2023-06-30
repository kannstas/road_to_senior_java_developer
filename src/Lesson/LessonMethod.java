package Lesson;

public class LessonMethod {
    public static void main(String[] args) {
        printHello();
        printHello();

        int s = 10;
        int s2 = 22;
        printSum(s, s2);
        printSum(100, 299);

        int resultSum = sum(7, 77);
        System.out.println(resultSum + " resultSum");
        int l2 = printString("dfg", "sdffsf");
        System.out.println(l2);

        System.out.println(printBigger(19, 20));
        System.out.println(printBigger(1, 2));
        int[] array = {1, 3, 5, 6, 3};
        System.out.println(sum(array));
        System.out.println(lenght("sqeeqe", "rwdefwfewf", "ewfwfefw"));

        System.out.println(lenght(new String[]{"edfwew", "wfwfww", "fwfwff"}));
    }

    public static void printHello() {
        System.out.println("Hello");
    }

    public static void printSum(int s, int s2) {
        int result = s + s2;
        System.out.println(result);
    }

    public static int sum(int s1, int s2) {
        int result = s1 + s2;
        return result;
    }

    public static int printString(String s, String s1) {
        int l = s.length() + s1.length();
        return l;

    }

    public static int printBigger(int b, int b1) {
        return b > b1 ? b : b1;

    }

    public static int sum(int s, int s1, int s2) {
        return s + s1 + s2;

    }

    public static int sum(int... n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        return sum;
    }

    public static int lenght(String... n) {
        int maxLenght = n[0].length();
        for (int i = 0; i < n.length; i++) {
            if (maxLenght < n[i].length()){
               maxLenght = n[i].length();
            }
        }
        return maxLenght;

    }

}
