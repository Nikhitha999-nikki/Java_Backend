import java.util.concurrent.*;
public class ExecutorServiceDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Callable<Integer> task = () -> {
            int fact = 1;
            for (int i = 1; i <= 5; i++) fact *= i;
            return fact;
        };
        Future<Integer> result = service.submit(task);
        System.out.println("Factorial: " + result.get());
        service.shutdown();
    }
}
