package Dz_2805;

import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = 2;
        int points = 0;
        System.out.println("Приветсвуем вас на нашей мини-викторине! Вам предстоит отгадать животное по короткому описанию");

        points = riddle("1. Кого из животных считают царем зверей?","лев",points,c);
        c = 2;
        points = riddle("1. Кого из животных считают царем зверей?","лев",points,c);;

        while (true) {

            System.out.println("2. Кого из животных считают санитаром леса?");
            String answer1 = in.nextLine().strip();
            if (answer1.equalsIgnoreCase("волк")) {
                System.out.println("Молодец! Теперь количество твоих баллов: " + ++points);
                break;
            } else {
                if (c != 0) {
                    System.out.println("Попробуйте еще раз. Оставшееся количество попыток: " + --c);
                } else {
                    System.out.println("Вы израсходовали все попытки");
                    break;
                }
            }
        }
        c = 2;
        while (true) {

            System.out.println("3. Самое большое животное в мире? ");
            String answer1 = in.nextLine().strip();
            if (answer1.equalsIgnoreCase("Синий кит")) {
                System.out.println("Молодец! Теперь количество твоих баллов: " + ++points);
                break;
            } else {
                if (c != 0) {
                    System.out.println("Попробуйте еще раз. Оставшееся количество попыток: " + --c);
                } else {
                    System.out.println("Вы израсходовали все попытки");
                    break;
                }
            }
        }
        c = 2;
        while (true) {

            System.out.println("4. Какое животное самое быстрое? ");
            String answer1 = in.nextLine().strip();
            if (answer1.equalsIgnoreCase("гепард")) {
                System.out.println("Молодец! Теперь количество твоих баллов: " + ++points);
                break;
            } else {
                if (c != 0) {
                    System.out.println("Попробуйте еще раз. Оставшееся количество попыток: " + --c);
                } else {
                    System.out.println("Вы израсходовали все попытки");
                    break;
                }
            }
        }
        c = 2;
        while (true) {

            System.out.println("5. Какого зверя чаще всего ассоциируют с Россией?");
            String answer1 = in.nextLine().strip();
            if (answer1.equalsIgnoreCase("медведь")) {
                System.out.println("Молодец! Теперь количество твоих баллов: " + ++points);
                break;
            } else {
                if (c != 0) {
                    System.out.println("Попробуйте еще раз. Оставшееся количество попыток: " + --c);
                } else {
                    System.out.println("Вы израсходовали все попытки");
                    break;
                }
            }
        }
        c = 2;
        while (true) {

            System.out.println("6. Кто лучший друг человека?");
            String answer1 = in.nextLine().strip();
            if (answer1.equalsIgnoreCase(("собака")) || ((answer1.equalsIgnoreCase("Пес"))) || ((answer1.equalsIgnoreCase("пёс")))) {
                System.out.println("Молодец! Теперь количество твоих баллов: " + ++points);
                break;
            } else {
                if (c != 0) {
                    System.out.println("Попробуйте еще раз. Оставшееся количество попыток: " + --c);
                } else {
                    System.out.println("Вы израсходовали все попытки");
                    break;
                }
            }
        }
        c = 2;
        while (true) {

            System.out.println("7. Какое животное строит плотины?");
            String answer1 = in.nextLine().strip();
            if ((answer1.equalsIgnoreCase(("бобёр")) || ((answer1.equalsIgnoreCase("бобер"))) || ((answer1.equalsIgnoreCase("бобр"))))) {
                System.out.println("Молодец! Теперь количество твоих баллов: " + ++points);
                break;
            } else {
                if (c != 0) {
                    System.out.println("Попробуйте еще раз. Оставшееся количество попыток: " + --c);
                } else {
                    System.out.println("Вы израсходовали все попытки");
                    break;
                }
            }
        }
        c = 2;
        while (true) {

            System.out.println("8. Какое животное дает молоко?");
            String answer1 = in.nextLine().strip();
            if (answer1.equalsIgnoreCase("корова")) {
                System.out.println("Молодец! Теперь количество твоих баллов: " + ++points);
                break;
            } else {
                if (c != 0) {
                    System.out.println("Попробуйте еще раз. Оставшееся количество попыток: " + --c);
                } else {
                    System.out.println("Вы израсходовали все попытки");
                    break;
                }
            }
        }
        c = 2;
        while (true) {

            System.out.println("9. Какое животное чаще всего участвует в скачках?");
            String answer1 = in.nextLine().strip();
            if (answer1.equalsIgnoreCase("лошадь")) {
                System.out.println("Молодец! Теперь количество твоих баллов: " + ++points);
                break;
            } else {
                if (c != 0) {
                    System.out.println("Попробуйте еще раз. Оставшееся количество попыток: " + --c);
                } else {
                    System.out.println("Вы израсходовали все попытки");
                    break;
                }
            }
        }
        c = 2;
        while (true) {

            System.out.println("10. Какое животное было главным героем фильма Челюсти?");
            String answer1 = in.nextLine().strip();
            if ((answer1.equalsIgnoreCase("акула")) || (answer1.equalsIgnoreCase("белая акула"))) {
                System.out.println("Молодец! Теперь количество твоих баллов: " + ++points);
                break;
            } else {
                if (c != 0) {
                    System.out.println("Попробуйте еще раз. Оставшееся количество попыток: " + --c);
                } else {
                    System.out.println("Вы израсходовали все попытки");
                    break;
                }
            }


        }
        if (points >= 9) {
            System.out.println("Вы закончили викторину! Количество ваших баллов:" + points);
            System.out.println("Ваша оценка отлично");
        } else if (points >= 5) {
            System.out.println("Вы закончили викторину! Количество ваших баллов:" + points);
            System.out.println("Ваша оценка хорошо");
        } else if (points >= 2) {
            System.out.println("Вы закончили викторину! Количество ваших баллов:" + points);
            System.out.println("Ваша оценка удовлетворительно");
        } else {
            System.out.println("Вы не прошли викторину. Количество ваших баллов:" + points);
            System.out.println("Ваша оценка неудовлетворительно. Пройдите викторину еще раз");
        }


    }

    public static int riddle(String q, String answer,int points,int c ) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(q);
            String answer1 = in.nextLine().strip();
            if ((answer1.equalsIgnoreCase(answer)) ) {
                System.out.println("Молодец! Теперь количество твоих баллов: " + ++points);
                return points;
            } else {
                if (c != 0) {
                    System.out.println("Попробуйте еще раз. Оставшееся количество попыток: " + --c);
                } else {
                    System.out.println("Вы израсходовали все попытки");
                    return points;
                }
            }


        }
    }
}
