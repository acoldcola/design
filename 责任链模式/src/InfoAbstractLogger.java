/**
 * @Author ZhangKe
 * @Date 2020/8/24 14:16
 * @Version 1.0
 */
public class InfoAbstractLogger extends AbstractLogger {

    public InfoAbstractLogger(int level){
        this.level = level;
    }
    @Override
    public void write(String message) {
        System.out.println("Info: " + message);
    }
}
