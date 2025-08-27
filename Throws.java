import java.util.*;
class Throws{
    public static void check(int age) throws Exception{
        if(age<18)
        {
            throw new Exception(">18 people are only eligible for voting");
        }
        else{
            System.out.println("Yeah! You are eligible for voting..");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
        check(age);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}