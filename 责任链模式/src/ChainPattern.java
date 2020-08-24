/**
 * @Author ZhangKe
 * @Date 2020/8/24 14:22
 * @Version 1.0
 * 创造记录器
 */
public class ChainPattern {
    public static AbstractLogger getAbstractLogger(){
        AbstractLogger errorAbstractLogger = new ErrorAbstractLogger(AbstractLogger.ERROR);
        AbstractLogger debugAbstractLogger = new DebugAbstractLogger(AbstractLogger.DEBUG);
        AbstractLogger infoAbstractLogger = new InfoAbstractLogger(AbstractLogger.INFO);
        debugAbstractLogger.setNextLogger(infoAbstractLogger);
        errorAbstractLogger.setNextLogger(debugAbstractLogger);
        return errorAbstractLogger;
    }
}
