import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        try{
            int s=n/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("DIVISION BY ZERO NOT ALLOWS");
        }
        finally{
            System.out.println("this block execute without consideration of any error or exception ; regardless of whether an exception occurs or not. ");
            System.out.println("when we have put our imp info in this block when power off all are gone except finally execute itself safely");
        }
    }
}