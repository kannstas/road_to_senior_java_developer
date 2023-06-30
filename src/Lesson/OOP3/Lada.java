package Lesson.OOP3;

public class Lada  extends  Auto{
    public Lada(String model, int horsePower) {
        super(model, horsePower);
    }

    @Override
    public void start() {
        System.out.println("Лада завелась");
    }

    public void blockDoor () {
        System.out.println("двери заблокированы");
    }
}
