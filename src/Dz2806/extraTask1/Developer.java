package Dz2806.extraTask1;
/*

2. Задание: Реализуйте класс Developer, который наследуется от Employee.
Добавьте поле hourlyRate типа double, которое представляет ставку оплаты за час работы разработчика.
Реализуйте метод calculateSalary(), который принимает количество отработанных часов и возвращает зарплату разработчика,
рассчитанную как произведение количества часов на ставку оплаты.

 */
public class Developer extends Employee{
    private double hourlyRate;
    private int hourWork;

    public Developer(String name, int age, int hourWork) {
        super(name, age);
        this.hourlyRate = 4000;
        this.hourWork = hourWork;
    }
    public double getHourlyPate() {
        return hourlyRate;
    }

    public void setHourlyPate(double hourlyPate) {
        this.hourlyRate = hourlyPate;
    }

    public int getHourWork() {
        return hourWork;
    }

    public void setHourWork(int hourWork) {
        this.hourWork = hourWork;
    }

    public void calculateSalary () {
        System.out.println("Ваша зарплата за месяц, разработчик  " + getName() + " , составила:  " + (hourWork*hourlyRate));
    }
}
