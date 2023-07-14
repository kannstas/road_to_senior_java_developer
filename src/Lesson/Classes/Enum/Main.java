package Lesson.Classes.Enum;

public class Main {
    public static void main(String[] args) {
        Colors colors = Colors.BRILIANT_BLU;
        colors.info();

        for (Colors value : Colors.values()) {
            System.out.println(value.ordinal() +" "+ value.name() + " -> " + value.getColorRu());
        }
    }
}
