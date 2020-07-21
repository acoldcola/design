import java.lang.reflect.Proxy;

/**
 * @Author ZhangKe
 * @Date 2020/7/20 14:08
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyAopHandler myAopHandler = new MyAopHandler(userService);
        UserService proxyInstance = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), myAopHandler);
        proxyInstance.add();
        proxyInstance.update();
    }
}
