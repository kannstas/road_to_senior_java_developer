package Dz_0507.task2;

public class inputException extends Exception {

    private String message  = "Неверно введен город. Доступные города для ввода: Москва Ростов Воронеж Сочи Краснодар. " +
            "Введенный пользователем город:  ";
    private String answer ;

    public inputException(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return message + answer;
    }
}
