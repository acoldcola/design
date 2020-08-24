/**
 * @Author ZhangKe
 * @Date 2020/8/24 15:50
 * @Version 1.0
 */
public class OneEat extends Eat {
    @Override
    public void breakfast() {
        System.out.println("稀饭");
    }

    @Override
    public void lunch() {
        System.out.println("猪肉");
    }

    @Override
    public void dinner() {
        System.out.println("面条");
    }
}
