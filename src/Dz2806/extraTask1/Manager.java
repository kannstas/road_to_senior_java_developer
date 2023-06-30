package Dz2806.extraTask1;
/*
1. Задание: Реализуйте класс Manager, который наследуется от Employee.
Добавьте дополнительное поле bonus типа double, которое представляет собой размер бонуса, выплачиваемого менеджеру.
Реализуйте метод calculateSalary(), который возвращает общую сумму зарплаты менеджера, включая основную зарплату и бонус.
 */

public class Manager extends Employee{

    private double bonus;
    private double rate;
    public Manager(String name, int age, double rate) {
        super(name, age);
        this.bonus = 1000;
        this.rate = rate;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void calculateSalary () {
        System.out.println("Ваша зарплата за месяц, менеджер  " + getName()+ ", соcтавила  " + (bonus+rate) );

    }
}


