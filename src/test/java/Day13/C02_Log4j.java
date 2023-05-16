package Day13;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C02_Log4j {
//main class açmak zorundayız

    public static void main(String[] args) {
//hata ayıklama,run time da dataylı görmek için işe yarar,geçmişi kontrol etmek için işe yarar.genelde developarlar kullanırlar
        // Logger with default log4j configuration
        // default log level is error
        Logger logger = LogManager.getLogger(C02_Log4j.class.getName());

        logger.trace("This is a trace message"); // trace
        logger.debug("This is a debug message"); // debug
        logger.info("This is an info message"); // info
        logger.warn("This is a warning message"); // warn
        logger.error("This is an error message"); // error
        logger.fatal("This is a fatal message"); // fatal
    }

}






