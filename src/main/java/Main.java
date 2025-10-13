import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Loading Spring context...");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Context loaded successfully!");
        Car car = (Car) context.getBean("car");
        car.drive();
        System.out.println("Program finished!");
    }
}
