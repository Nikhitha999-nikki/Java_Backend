class Account{
    private int balance=1000;
    public synchronized void withdraw(int amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println(Thread.currentThread()+"withdraw : "+amount+"balance : "+balance);
        }
        else{
            System.out.println("insufficient funds...");
        }
    }
}
public class sync{
    public static void main(String[] args)
    {
        Account ac=new Account();
        Runnable task=()->ac.withdraw(200);
        Runnable tas=()->ac.withdraw(10000);
        new Thread(task,"Thread1").start();
        new Thread(tas,"Thread2").start();
    }
}