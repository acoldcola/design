/**
 * @Author ZhangKe
 * @Date 2020/7/20 11:36
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserService userService1 = new UserServiceProxy(userService);
        userService1.add();
        userService1.update();
    }
}
