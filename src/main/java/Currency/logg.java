package Currency;


    import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

    public class logg {

        static final Logger logger = Logger.getLogger(logg.class);
       // static final String path = "src/resources/log4j.properties";
        static final String path = "src/main/log.properties";
        public static void main(String[] args) {

             PropertyConfigurator.configure(path);
            logger.debug("Sample debug message");
            logger.info("Sample info message");
            logger.warn("Sample warn message");
            logger.error("Sample error message");
            logger.fatal("Sample fatal message");
        }
    }

