package Singleton;

public class LazyInitializedSingletonTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
        };

        for (int i = 0; i < 10; i++) {
            new Thread(task, "Thread-" + i).start();
        }
    }
}
