package api;

import sping.user.User;

/**
 * Created by stycz0007 on 19.05.16.
 */
public interface UserRepo {
    User createUser(String name);
    void setLoggerr(Loggerr loggerr);


}
