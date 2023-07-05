package Dz_0507.task1;

public class IncorrectlyEnteredAmountException extends Exception{
    private String massage = "Неверно введена сумма товара. Введите сумму товара от 1000 до 10000";

    @Override
    public String toString() {
        return massage;
    }
}
