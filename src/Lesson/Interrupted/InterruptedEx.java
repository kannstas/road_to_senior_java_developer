package Lesson.Interrupted;

public class InterruptedEx {
    public static void main(String[] args) throws InterruptedException {
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();


        Thread.sleep(300);
        interruptedThread.interrupt();

        interruptedThread.join();

        System.out.println("Main end");
    }

}

class InterruptedThread extends Thread {
    @Override
    public void run() {
        double sqrtSum = 0;
        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("Поток был прерван");
                System.out.println("на момент прерывания, " + sqrtSum);
                break;
            }
            sqrtSum += i;
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Поток был прерван во время сна");
                System.out.println("на момент прерывания, " + sqrtSum);
                break;
            }

        }
        System.out.println(sqrtSum);
    }
}
