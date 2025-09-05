//Runtime(overriding)
class overload{
    public void add(){
        System.out.println("parent");
    }

}
class base extends overload{
  public void add(){
        super.add();
        System.out.println("base");
    }
}
class Runtime{

     public static void main(String []args){
        overload a=new base();
        a.add();
     }
}