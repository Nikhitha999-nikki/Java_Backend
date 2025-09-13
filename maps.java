import java.util.*;
public class maps{
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("nikki", 1);
        map.put("nikki", 2);//takes latest key:value pair when duplicate key is added
        map.put("nandu", 3);
        System.out.println(map);
        map.get("nikki");
        map.remove("nikki");
        System.out.println(map);
        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection<Integer> values = map.values();
        System.out.println(values);

        boolean b=map.isEmpty();
        System.out.println(b);
        map.clear();
        System.out.println(map);
    }
}