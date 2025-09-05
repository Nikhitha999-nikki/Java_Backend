//Abstract class amd inheritance
abstract class vehicle{
  abstract void process();
  abstract void end();
  public void start()
  {
    System.out.println("car started...");
  }
}
class car extends vehicle{
  void process()
  {
    System.out.println("car running,,,");
  }
  void end(){
    System.out.println("Reach destination,,,");
  }
}
public class AbsInt{
public static void main(String[] args)
{
  vehicle v=new car();
  v.start();
  v.process();
  v.end();
}
}