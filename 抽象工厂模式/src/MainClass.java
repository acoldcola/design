/**
 * @Author ZhangKe
 * @Date 2020/7/21 15:20
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        SportFactory sportFactory = new SportFactory();
        Sport basketball = sportFactory.getSport("basketball");
        PersonFactory personFactory = new PersonFactory();
        Person woman = personFactory.getPerson("woman");
        basketball.play();
        woman.say();
    }
}
