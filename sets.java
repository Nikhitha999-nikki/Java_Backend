import java.util.*;
public class sets{
    public static void main(String[] args){
        Set<String> f=new HashSet<>();
        f.add("hello");
        f.add("hii");
        f.add("hello");
        f.remove("hii");
        f.add("hii");
        System.out.println(f);
        f.clear();
        System.out.println(f);
       
    }
}