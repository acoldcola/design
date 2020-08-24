/**
 * @Author ZhangKe
 * @Date 2020/8/24 14:20
 * @Version 1.0
 */
public class ErrorAbstractLogger extends AbstractLogger {
    ErrorAbstractLogger(int level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Error: " + message);
    }
}
