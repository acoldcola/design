/**
 * @Author ZhangKe
 * @Date 2020/7/15 17:42
 * @Version 1.0
 * 继承Subject，在里面实现具体业务
 */
public class ConcreteSubject extends Subject{
    public void doSomeIng() {
        System.out.println("我把自己修改了");
        super.notifyAllObserver();
    }
}
