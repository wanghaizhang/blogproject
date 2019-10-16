package site.uuyy.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JCL {
    public static void main(String[] args) {
        Log log=LogFactory.getFactory().getInstance(JCL.class);
        log.info("jcl");
    }
}
