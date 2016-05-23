package MainPackage;

import api.UserRepo;
import implementation.SomeBean;
import implementation.UserRepoImplem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sping.user.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by stycz0007 on 19.05.16.
 */
public class MainSpring {
    public static void main(String[] args) {
//        Locale locale = Locale.getDefault();
//        Calendar calendar = GregorianCalendar.getInstance(locale);
//
//        DateFormat dateFormat = SimpleDateFormat.getDateInstance();
//        System.out.println(dateFormat.format(calendar.getTime()));
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Calendar calendarBean = applicationContext.getBean("calendar", Calendar.class);
        DateFormat dateFormat = (DateFormat) applicationContext.getBean("formatter");
        System.out.println(dateFormat.format(calendarBean.getTime()));

    }
}
