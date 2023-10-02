package Lesson.CallableEX;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new RunnableFactorial(5));

        try {
            executorService.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(factorial);




        Future<Integer> future= executorService.submit(new CallableFactorial(-1));
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }

    static int factorial = 0;

}

class RunnableFactorial implements Runnable {
    int f;

    public RunnableFactorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("неверное число");
            return;
        }

        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        Main.factorial = result;
    }
}

class CallableFactorial implements Callable<Integer>  {
    int f;

    public CallableFactorial(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {


           if (f <= 0) {
               throw new RuntimeException("Не верное число");
           }


        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}

