import java.util.*;
import java.util.function.Function;

class LambdaFun {
    public static void main(String[] args) {
        Function<Integer, String> n = (num) -> "Entered number: " + num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(n.apply(num));

        if (num > 18)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
    }
}
