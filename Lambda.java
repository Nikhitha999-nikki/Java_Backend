//Lambda Expressions

interface FunInterface{
  void absFun(int x);
  default void normal(){
    System.out.println("i;m normal fun");
  }
}
public class Lambda
{
	public static void main(String[] args) {
		FunInterface fobj=(int x)->System.out.println(2*x); //lambda exp
		fobj.absFun(5);
	}
}