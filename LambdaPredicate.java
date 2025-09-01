//predicate same as function but it return only boolean values
//we use test() method here

import java.util.*;
import java.util.function.Predicate;
class LambdaPredicate{
    public static void main(String[] args){
        Predicate<String> n=(type)->type.equals("female");
        Scanner sc=new Scanner(System.in);
        String type=sc.nextLine();
        System.out.println(n.test(type));
        
    }

}
