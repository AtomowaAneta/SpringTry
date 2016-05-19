package sping.user;

/**
 * Created by stycz0007 on 19.05.16.
 */
public class User {
    public User(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
