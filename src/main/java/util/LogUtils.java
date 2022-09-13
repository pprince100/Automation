package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LogUtils {

    private static Logger logger = LoggerFactory.getLogger(LogUtils.class);

    private static String getPrettyMessage(String message) {
        return " Logs " + message;
    }

//    private static void sysout(String message) {
//        System.out.println(getPrettyMessage(message));
//    }

    public static void info(String message) {
        logger.info(getPrettyMessage(message));
        //sysout(message);
    }
}
