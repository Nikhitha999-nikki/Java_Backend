import java.util.*;
class set{
    public static void main(String[] args){
        HashSet<String> states=new HashSet<>();
        states.add("anantapur");
        states.add("kadapa");
        states.add("guntur");
        states.add("tpt");
        states.add("kurnool");
        states.add("vjd");
        Iterator it=states.iterator();
        while(it.hasNext()){
            String s=(String)it.next();
            System.out.println(s);
        }
        
    }
}