package Dz_2007;

public class Laptop implements Cloneable {
    private String model;
    private int price;
    private Processor processor;
    private Ram ram;
    private VideoCard videoCard;

    public Laptop(String model, int price, int hertz, int volumeMemory, String nameModel, int volumeVideoCard) {
        this.model = model;
        this.price = price;
        this.processor = new Processor(hertz);
        this.ram = new Ram(volumeMemory);
        this.videoCard = new VideoCard(nameModel, volumeVideoCard);



    /* public Laptop(String model, int price, Processor processor, Ram ram, VideoCard videoCard) {
        this.model = model;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
        this.videoCard = videoCard;

     */

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Laptop(model, price, processor.getHertz(), ram.getVolumeMemory(), videoCard.getNameModel(), videoCard.getVolumeVideoCard());


        //  return new Laptop(model, price, processor, ram, videoCard);
    }
}

