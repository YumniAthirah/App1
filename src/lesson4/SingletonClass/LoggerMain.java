package lesson4.SingletonClass;

public class LoggerMain {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Hello, world!");
    }
}
