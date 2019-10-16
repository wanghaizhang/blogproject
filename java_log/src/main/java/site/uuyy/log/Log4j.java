package site.uuyy.log;


import org.apache.log4j.Logger;

public class Log4j {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger(Log4j.class);
        logger.info("log4j1");
    }
}
