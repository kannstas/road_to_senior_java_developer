package Dz_2809_ThreadPool.Task3_NewCachedThreadPoolEX;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 3; i++) {
            executorService.execute(new Call("Fedor"));
            executorService.execute(new Call("Anna"));
            executorService.execute(new Call("Lisa"));
        }

        executorService.shutdown();



    }
}

class Call implements Runnable{
    String name;

    public Call(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("звонит " + name);
    }
}
