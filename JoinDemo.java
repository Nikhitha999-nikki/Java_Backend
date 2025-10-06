class manager extends Thread
{
    public manager(String name){
        super(name);
    }
    public void run()
    {
        System.out.println(getName()+" is in active ...");
    }
}
public class JoinDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        manager t1=new manager("nikki");
        manager t2=new manager("Nandu");
        manager t3=new manager("Daddy");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}