//interface
interface i1 {
    final int n = 10;
    public void display();
    public void test();
}

class i2 implements i1 {
    public void display() {
        System.out.println("display");
    }
    public void test() {
        System.out.println("test from i2");
    }
}

class i3 implements i1 {
    public void display() {
        System.out.println("display from i3");
    }
    public void test() {
        System.out.println("testing..");
    }
}

public class Inter {
    public static void main(String[] args) {
        i2 obj1 = new i2();
        obj1.display();
        obj1.test();

        i3 obj2 = new i3();
        obj2.display();
        obj2.test();
    }
}