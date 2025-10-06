import java.util.concurrent.*;
class ThreadPool
{
    public static void main(String[] args)
    {
        ExecutorService ex=Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++)
        {
            Runnable task=()->{
                System.out.println(Thread.currentThread().getName()+" is in work");
                try
                {
                    Thread.sleep(200);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            };
            ex.submit(task);
        }
    }
}