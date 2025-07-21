package LambdaExpression; 

public class Multithreading_2 {

    public static void main(String[] args) {
        Runnable run = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(run);
        thread1.start();
    }
}
