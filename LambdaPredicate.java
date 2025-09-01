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