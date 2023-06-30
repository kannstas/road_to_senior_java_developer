package Lesson.OOP2;

import java.util.Scanner;

public class Terminal {

   private Bank bank;

    public Terminal(Bank bank) {
        this.bank = bank;
    }

    Scanner in = new Scanner(System.in);

    public void start() {
        block1:
        while (true) {

            System.out.println("банк " + bank.getName());
            System.out.println("1 баланс банка");
            System.out.println("2 инкасация");
            System.out.println("3 изменить название банка");
            System.out.println("0 выйти");

            String answer = in.nextLine();
            switch (answer) {
                case "1" -> {
                    System.out.println(bank.getBalance() + " balanc");
                }
                case "2" -> {
                    bank.setBalance(-100);
                    incas();
                }
                case "3" -> { nameBank();
                }
                case "0" -> {
                    break block1;
                }

                default -> System.out.println("повторите ввод ");
            }
        }
    }

    public void incas() {
        System.out.println("Введите сумму для инкассации");
        double answerIncas = in.nextDouble();
        in.nextLine();
        if (answerIncas <= bank.getBalance()) {
            bank.setBalance(bank.getBalance() - answerIncas);
        } else {
            System.out.println("Недостаточно средств на счете");
        }
    }

    public void nameBank () {
        System.out.println("Введите название банка");
        String answerNameBank = in.nextLine();
        bank.setName(answerNameBank);
    }

}
