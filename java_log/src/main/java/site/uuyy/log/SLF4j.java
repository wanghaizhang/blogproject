package site.uuyy.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4j {
    public static void main(String[] args) {
        Logger logger=LoggerFactory.getLogger(SLF4j.class);
        logger.info("slf4j");
    }
}
