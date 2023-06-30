package Dz2806.task2;

public class Nokia extends Phone implements Push_buttonPhone{

    public Nokia(String model) {
        super(model);
    }

    @Override
    public void call() {
        System.out.println( model + " готова к звонку");
    }

    @Override
    public void playMusic() {
        System.out.println(model+ "  включила музыку");
    }
}
