package Dz2806.task2;

public class Iphone extends Phone implements Smartphone{
    public Iphone(String model) {
        super(model);
    }

    @Override
    public void call() {
        System.out.println( model + " готов к звонку");
    }

    @Override
    public void playVideo() {
        System.out.println( model + " запустил видео");

    }

    @Override
    public void showImage() {
        System.out.println(model + "  открыл изображение");
    }
}
