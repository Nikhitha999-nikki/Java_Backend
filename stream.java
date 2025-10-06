import java.util.stream.*;
class stream{
    public static void main(String[] args)
    {
        System.out.println("seq..");
        IntStream.rangeClosed(1,5).forEach(System.out::println);
        System.out.println("pall..");
        IntStream.rangeClosed(1,5).parallel().forEach(System.out::println);
    }
}