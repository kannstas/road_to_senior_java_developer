package Dz2806.extraTask1;
/*
Реализуйте класс Salesman, которыйРеализуйте класс Salesman, который наследуется от Employee.
 Добавьте поле commissionRate типа double, которое представляет процент комиссионных, выплачиваемых продавцу.
 Реализуйте метод calculateSalary(), который принимает сумму продаж и возвращает зарплату продавца,
 рассчитанную как произведение суммы продаж на процент комиссионных.
 */
public class Salesman extends Employee{
    private int numberOfSales;
    private double commissionRate;
    private double fixedRate;
    public Salesman(String name, int age, int numberOfSales) {
        super(name, age);
        this.numberOfSales = numberOfSales;
        this.commissionRate = 7;
        this.fixedRate = 20000;

    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getFixedRate() {
        return fixedRate;
    }

    public void setFixedRate(double fixedRate) {
        this.fixedRate = fixedRate;
    }

    public void calculateSalary () {
        System.out.println("Ваша зарплата за месяц, продавец-консультант  " + getName() + ", состоит из: фиксированная заработная плата -   " + fixedRate
                + " и процента от продаж - " + (numberOfSales*commissionRate)
                + ". В итоге, заработная плата за месяц составила:  " + (fixedRate + (numberOfSales*commissionRate)));
    }
}
