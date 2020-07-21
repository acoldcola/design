/**
 * @Author ZhangKe
 * @Date 2020/7/15 18:32
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        Man man = new NormalMan("张科");
        Man man1 = new CarDecoratorImpl(man);
        Man man2 = new HouseDecoratorImpl(man1);
        man1.getManDesc();
        man2.getManDesc();
    }
}
