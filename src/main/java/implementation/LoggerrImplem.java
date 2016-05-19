package implementation;

import api.Loggerr;

import java.util.Date;

/**
 * Created by stycz0007 on 19.05.16.
 */
public class LoggerrImplem implements Loggerr {
    public void logMessage(String message) {
        System.out.println(new Date() + " " + message);
    }
}
