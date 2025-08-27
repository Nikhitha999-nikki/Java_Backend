# throw (Custom Error) (declared within block/method)

import java.util.*;
class Custom{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<18)
        {
            throw new ArithmeticException(">18 people are only eligible for voting");
        }
        else{
            System.out.println("Yeah! You are eligible for voting..");
        }
    }
}