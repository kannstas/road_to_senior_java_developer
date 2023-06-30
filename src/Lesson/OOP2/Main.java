package Lesson.OOP2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("сбер", 110_000.5);
        Terminal terminal = new Terminal( bank);
        terminal.start();

    }
}
