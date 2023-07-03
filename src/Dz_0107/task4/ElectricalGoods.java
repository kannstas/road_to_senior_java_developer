package Dz_0107.task4;


public abstract class ElectricalGoods {
    private String nameGoods;
    private double price;
    static int count = 0;

    public ElectricalGoods(String nameGoods, double price) {
        this.nameGoods = nameGoods;
        this.price = price;
    }

    public String getNameGoods() {
        return nameGoods;
    }

    public void setNameGoods(String nameGoods) {
        this.nameGoods = nameGoods;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void info() {
        System.out.println(nameGoods + " " + price);
        count++;
    }
}
