import java.util.Scanner;
public class Generics<T>{
    T age;
    Generics(T age){
        this.age=age;
    }
    T getAge(){
        return age;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Integer a=sc.nextInt();
        Generics<Integer> obj1=new Generics<>(a);
        System.out.println("Age: "+obj1.getAge());
        Long b=sc.nextLong();
        Generics<Long> obj2=new Generics<>(b);
        System.out.println("Age: "+obj2.getAge());
    }
}


