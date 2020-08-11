/**
 * @Author ZhangKe
 * @Date 2020/8/10 16:33
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        Strategy busStrategy = new BusStrategy();
        Context context = new Context(busStrategy);
        context.executeStrategy();
        Strategy trainStrategy = new TrainStrategy();
        Context context1 = new Context(trainStrategy);
        context1.executeStrategy();
    }
}
