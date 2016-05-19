package implementation;

import api.Loggerr;

import java.util.Date;

/**
 * Created by stycz0007 on 19.05.16.
 */
public class LoggerrImplem implements Loggerr {
    private String name;
    private double version;
    public void logMessage(String message) {
        System.out.println(new Date() + " " + message + " " + name + "version: " + version);

    }

    public void setName(String name) {
        this.name=name;
    }

    public void setVersion(double version) {
        this.version=version;
    }
}
