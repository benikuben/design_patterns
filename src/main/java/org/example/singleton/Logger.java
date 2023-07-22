package org.example.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static volatile Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null)
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        return logger;
    }

    public void classLog(Object obj, String info) {
        System.out.println("Log info: " +
                new SimpleDateFormat("dd.MM.yy").format(new Date()) +
                " - " + obj.getClass().getSimpleName() +
                " - " + info);
    }
}
