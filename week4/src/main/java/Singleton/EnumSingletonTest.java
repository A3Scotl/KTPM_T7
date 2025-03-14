package Singleton;

public class EnumSingletonTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            EnumSingleton instance = EnumSingleton.INSTANCE;
            System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
        };

        for (int i = 0; i < 10; i++) {
            new Thread(task, "Thread-" + i).start();
        }
    }
}
