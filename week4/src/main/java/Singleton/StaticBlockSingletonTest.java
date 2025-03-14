package Singleton;

public class StaticBlockSingletonTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            StaticBlockSingleton instance = StaticBlockSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
        };

        for (int i = 0; i < 10; i++) {
            new Thread(task, "Thread-" + i).start();
        }
    }
}
