/**
 * @Author ZhangKe
 * @Date 2020/7/15 17:43
 * @Version 1.0
 * 具体观察者，实现观察者接口
 */
public class ConcreteObserver01 implements Observer{
    @Override
    public void update() {
        System.out.println("观察者1号收到消息，马上进行处理");
    }
}
