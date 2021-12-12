package HelloLog4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        String msg = String.join(" ", args);
        System.out.println(msg);
        logger.error(msg);
    }
}
