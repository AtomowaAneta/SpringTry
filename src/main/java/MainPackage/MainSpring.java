package MainPackage;

import api.UserRepo;
import implementation.SomeBean;
import implementation.UserRepoImplem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sping.user.User;

/**
 * Created by stycz0007 on 19.05.16.
 */
public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
      //  UserRepo userRepo = applicationContext.getBean("userRepo", UserRepoImplem.class);
      //  User user =  userRepo.createUser("JanBardzo");

        SomeBean someBean = applicationContext.getBean("SomeBean", SomeBean.class );


    }
}
