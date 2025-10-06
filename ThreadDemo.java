class MyTask implements Runnable
{
    public void run()
    {
        
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++)
            {
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println();
        }
    }
}
public class ThreadDemo
{
    public static void main(String[] args)
    {
        Thread t1=new Thread(new MyTask());
        t1.start();
    }
}