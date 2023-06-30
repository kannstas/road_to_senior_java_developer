package Dz2806.extraTask1;


public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(" Алексей", 25, 3300);
        Developer developer = new Developer("Анастасия", 21, 160);
        Salesman salesman = new Salesman("Екатерина", 33, 200);
        developer.calculateSalary();
        manager.calculateSalary();
        salesman.calculateSalary();

    }
}
