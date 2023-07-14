package Dz_1307.task1;
/*
*
1 Создать интерфейс РаботникБанка  с 1 методом который вывыодит должность сотрудника

Создать класс Кассир и он имплементит интерфейс РаботникБанка
и переопределяет его метод  в котором выводи чот он кассир

в классе маин создать кассира и вывести у него метод который выводит должность сотрудника

 создать объекты анонимных классов

Администратор
Консультант
Стажер

и так же вывести у них метод который выводит должность сотрудника
 */
public class Main {
    public static void main(String[] args) {
        Teller teller = new Teller();
        BankEmployee administrator = new BankEmployee() {
            @Override
            public void showPost() {
                System.out.println("Я администратор");
            }
        };

        BankEmployee shopAssistant = new BankEmployee() {
            @Override
            public void showPost() {
                System.out.println("Я продавец-консультант");
            }
        };

        BankEmployee intern = new BankEmployee() {
            @Override
            public void showPost() {
                System.out.println("Я стажер");
            }
        };

        teller.showPost();
        administrator.showPost();
        shopAssistant.showPost();
        intern.showPost();

    }


}
