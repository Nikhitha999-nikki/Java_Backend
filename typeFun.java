import java.util.function.Consumer;
public class typeFun {
    int[] nums;  
    public void printNums() {
        Consumer<Integer> h = (x) -> System.out.println(x); //consumer functional interface
        for (int n : nums) {
            h.accept(n);
        }
    }
    public static void main(String[] args) {
        typeFun t = new typeFun();
        int[] a = {1, 2, 3, 4, 5};
        t.nums = a;
        t.printNums(); 
    }
}
