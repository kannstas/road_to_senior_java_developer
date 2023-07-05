package Lesson.Exception;

public class Main3 {
    public static void main(String[] args) {
        test1();

        try {
            test2();
        } catch (IllegalArgumentException | InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void test1(){
        for (int i = 0; i < 20; i++) {
            System.out.println("Изображение загруженно " + i);
            try{
                Thread.sleep(1000);
            }catch (IllegalArgumentException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void test2()throws IllegalArgumentException,InterruptedException{
        for (int i = 0; i < 20; i++) {
            System.out.println("Изображение загруженно " + i);
            Thread.sleep(1000);
        }
    }

}
