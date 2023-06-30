package Lesson;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello1");
        System.out.print("Hello2");
        System.out.println("Hello3");
        System.out.println("H");

        int x = 123;
        // примитивные типы данных 8
        byte n1 = 127;
        short n2 = 32767;
        int n3 = 2147000000;
        long n4 = 3000000000l;

        float n5 = 234.23443f;
        double n6 = 5234.4564564;

        boolean n7 = true;
        boolean n77 = false;
        boolean n777 = 10*7 > 80;
        char n8 = '!';
        System.out.println(n8);
        System.out.println(n777);

        //ссылочные типы данных
        Byte b1 = 127;
        Integer b4 = 123123;
        Character b8 = '+';
        String str = "Hello";
        String name = "Anna";
        System.out.println(str + " " +  name);
        int age = 11;
        System.out.println("вы можете получить паспорт через " + (14 - age));



        int i1 = 5;
        int i2 = 3;
        int i3 = 4;
        int i4 = 5;
        System.out.println("Годовая оценка:" + ((i1 + i2 + i3 + i4)/4));

        //не явное приведение типов
        float f = 7.7f;
        int f2 = (int) f;
        System.out.println(f2);

        // явно
        int f3 = 100;
        float f4 = f3;
        System.out.println(f4);

        int f6 = 12311;
        byte f5 = (byte) f6;
        System.out.println(f5);

        String s = "12";
        String ss = "5.5";
        int s1 = Integer.parseInt(s);
        float s2 = Float.parseFloat(ss);
        System.out.println(s1 + s1);
        System.out.println(s2  + s2);



    }
}
