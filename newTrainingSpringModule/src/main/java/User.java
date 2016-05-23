/**
 * Created by stycz0007 on 23.05.16.
 */
public class User {

    String name;
    int age;
    private User(){}

    public static User getInstance(String name, int age){
        User user = new User();
        user.name=name;
        user.age=age;
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
