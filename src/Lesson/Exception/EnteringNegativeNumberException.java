package Lesson.Exception;

public class EnteringNegativeNumberException extends RuntimeException{
    private String message = "сумма должна быть положительной";

    @Override
    public String toString() {
        return message;
    }
}
