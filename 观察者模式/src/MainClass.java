/**
 * @Author ZhangKe
 * @Date 2020/7/15 17:45
 * @Version 1.0
 * 客户端
 */
public class MainClass {
    public static void main(String[] args) {
        // 创建一个具体的被观察者
        ConcreteSubject subject = new ConcreteSubject();
        // 创建观察者
        Observer observer1 = new ConcreteObserver01();
        Observer observer2 = new ConcreteObserver02();
        subject.add(observer1);
        subject.add(observer2);
        subject.doSomeIng();
    }
}
