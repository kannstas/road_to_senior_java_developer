package Lesson.OOP1;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("X4", 350, "black", 249);
        Mercedes mercedes = new Mercedes( "S43", 340, "white", 434);
        Lada lada = new Lada("Vesta", 150,"gray", 97);

        Auto [] autos = {bmw,mercedes,lada};

        for (int i = 0; i < autos.length; i++) {
            System.out.print(autos[i].model + " ");
            autos [i].tax();

        }


        System.out.println(bmw.colour);
    }
}
