package Dz_0210_Callable_Semaphore_CountDownLatch.Task1;

import java.util.concurrent.*;

/*
Написать программу где поток вычисляет сумму чисел от 1 до указанного числа и возвращает результат в маине и выводит
если число переданное будет отрицательное выбросить ексепшен
 */
public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(new Sum(7));
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

}


class Sum implements Callable<Integer> {
    int number;


    public Sum(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {

        int result = 0;
        if (number < 0) {
            throw new RuntimeException("Число должно быть положительным");
        }
        for (int i = 1; i <= number; i++) {
            result+=i;
        }

        return result;
    }
}
