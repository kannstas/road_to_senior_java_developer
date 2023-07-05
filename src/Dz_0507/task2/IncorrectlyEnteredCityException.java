package Dz_0507.task2;

public class IncorrectlyEnteredCityException extends Exception {
    private String message  = "Неверно введен город. Доступные города для ввода: Москва Ростов Воронеж Сочи Краснодар. " +
            "Введенный пользователем город:  ";
    static String answer = null;
    @Override
    public String toString() {
        return message + answer;
    }
}
