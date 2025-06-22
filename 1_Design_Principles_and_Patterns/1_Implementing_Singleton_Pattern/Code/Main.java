class Logger {
    private static Logger singleTonInstance = new Logger();

    private Logger() {
        System.out.println("Logger Class Created.\n");
    }

    public void log(String message) {
        System.out.println("Info : " + message);
    }

    public static Logger getInstance() {
        return singleTonInstance;
    }
}
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Log test from Logger 1");
        logger2.log("Log test from Logger 2");

        if(logger1 == logger2) {
            System.out.println("\nBoth loggers points to same memory.");
        }
        else {
            System.out.println("Both logger not points to same memory.");
        }
    }
}