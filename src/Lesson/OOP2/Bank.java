package Lesson.OOP2;

public class Bank {
   private String name;
   private double balance;

    public Bank(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balanc){
        if (balanc <= this.balance && balanc >= 0) {
            infoIncas(this.balance - balanc);
            this.balance = balanc;
            infiBalancincas();

        }
    }
    public String getName () {
        return name;

    }
    public void setName (String name) {
        if (name.toLowerCase().contains("банк")) {
            this.name = name;
        }
    }

    private void infoIncas(double answerIncas){
        System.out.println("Инкассация проведена на сумму: " + answerIncas);

    }

    private void infiBalancincas(){
        System.out.println("Остаток:  " + balance);
    }
}
