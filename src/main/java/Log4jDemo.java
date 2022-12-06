import org.apache.log4j.Logger;

public class Log4jDemo {

   private static Logger logger = Logger.getLogger(Log4jDemo.class);
    public static void main(String[] args) {
        logger.trace("This is trace message");
        logger.warn("Hello. This is warning message");
        logger.info("Hello. This is infor message");
        logger.error("Hello. This is error message");

        System.out.println("\n Complete");
    }
}
