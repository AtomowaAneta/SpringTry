package implementation;

import api.Event;
import api.Loggerr;
import api.UserRepo;
import sping.user.User;

/**
 * Created by stycz0007 on 19.05.16.
 */
public class UserRepoImplem implements UserRepo  {
    private Loggerr loggerr;


    public UserRepoImplem(Loggerr loggerr, String localization, String dbName) {
        this.loggerr = loggerr;
        loggerr.logMessage("Localization: " + localization + " " + dbName);

    }



    public User createUser(String name) {
        loggerr.logMessage("New User: "+ name );
        return new User(name);
    }



}
