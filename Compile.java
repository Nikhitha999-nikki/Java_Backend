//polymorphism
//compiletime(function overloading)
class overload{
    public static int add(int a){
        return a;
    }
    public static int add(int a,int b){
        return a+b;
    }
}
class Compile{

     public static void main(String []args){
        overload a=new overload();
        System.out.println(a.add(1));
        System.out.println(a.add(1,8));
     }
}