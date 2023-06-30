package Dz2806.task1;

/*
создать класс маин
создать класс меню
создать класс котельная
класс школа
класс здание абстрактный
интерфейс учебное учереждение
гос здание интерфейс

создать класс школа (является зданием) является  и учебным учереждением
создать класс администрация(является зданием) и гос учереждением
создать класс универ(является зданием)

у всех этих классов есть 1 метод котрый выводит что вода поступила в данное здание
класс университет  являеться зданием и учебным учереждением
котельная является зданием
 */
public class Main {
    public static void main(String[] args) {
        Administration administration = new Administration();
        Furnace furnace = new Furnace();
        School school = new School();
        University university = new University();

        administration.waterArrived();
        furnace.waterArrived();
        school.waterArrived();
        university.waterArrived();
    }
}
