/**
 * @Author ZhangKe
 * @Date 2020/7/21 15:20
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        Sport basketball = SportFactory.getSport("basketball");
        basketball.play();
    }
}
