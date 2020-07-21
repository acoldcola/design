import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZhangKe
 * @Date 2020/7/15 17:36
 * @Version 1.0
 * 主题Subject,用于保存观察者
 */
public class Subject {
    List<Observer> list = new ArrayList<>();
    public void add(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer o : list) {
            o.update();
        }
    }
}
