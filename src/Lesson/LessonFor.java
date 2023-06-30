package Lesson;

public class LessonFor {
    public static void main(String[] args) {
        int i1 = 0;
        while (i1 < 100){
            System.out.print(i1 +" ");
            i1++;
        }


        System.out.println("-------");

        for (int i = 0,j=100 ; i<100 ; i++,j+=100){
            System.out.print(i +  " ," +  j + " " );
        }

        System.out.println();


        for (int i = 1000; i >0; i-- ){
            System.out.print(i + " ");
        }


        System.out.println();

        for (int i = 1; i <=9; i++ ){
            for (int j = 1; j<=9; j++){
               System.out.print("\t"+ (i*j));
            }
            System.out.println();
        }

        for (int i  = 1; i <=10; i++){
            for (int j = 1; j <=60; j++){
                System.out.print(0 + " ");
            }
            System.out.println();
        }





    }
}
