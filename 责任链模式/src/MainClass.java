/**
 * @Author ZhangKe
 * @Date 2020/8/24 14:21
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        AbstractLogger abstractLogger = ChainPattern.getAbstractLogger();
        abstractLogger.logMessage(AbstractLogger.INFO, "This is an Info level information.");
        abstractLogger.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        abstractLogger.logMessage(AbstractLogger.ERROR, "This is an error level information.");
    }
}
