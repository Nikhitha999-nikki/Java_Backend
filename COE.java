//class and objects,encapsulation
public class COE{
  int n;
  String name;
  public sam(int n,String name){
    this.n=n;
    this.name=name;
  }
  public void display(){
    System.out.println(name+n);
  }
  public static void main(String[] args)
  {
    sam s=new sam(9,"nikki");
    s.display();
  }
}