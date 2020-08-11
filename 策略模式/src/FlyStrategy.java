/**
 * @Author ZhangKe
 * @Date 2020/8/10 15:36
 * @Version 1.0
 * 抽象具体实现类
 */
public class FlyStrategy implements Strategy {
    @Override
    public void doSomeing() {
        System.out.println("坐飞机");
    }
}
