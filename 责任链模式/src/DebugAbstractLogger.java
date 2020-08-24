/**
 * @Author ZhangKe
 * @Date 2020/8/24 14:19
 * @Version 1.0
 */
public class DebugAbstractLogger extends AbstractLogger {
    DebugAbstractLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Debug: " + message);
    }
}
