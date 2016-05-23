import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by stycz0007 on 23.05.16.
 */
public class MainString {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("conf.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
