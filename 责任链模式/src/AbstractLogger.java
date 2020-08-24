import com.sun.deploy.panel.ITreeNode;

/**
 * @Author ZhangKe
 * @Date 2020/8/24 14:10
 * @Version 1.0
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    /**
     * 责任链中下一个对象
     */
    private AbstractLogger abstractLogger;

    public void setNextLogger(AbstractLogger abstractLogger){
        this.abstractLogger = abstractLogger;
    }

    public void logMessage(int level,String message){
        if (this.level <= level){
            write(message);
        }
        if (abstractLogger != null){
            abstractLogger.logMessage(level,message);
        }
    }

    /**
     * 抽象公共方法
     * @param message
     */
    abstract public void write(String message);
}
