import java.util.Date;

/**
 * @Author ZhangKe
 * @Date 2020/7/20 11:33
 * @Version 1.0
 */
public class UserServiceProxy implements UserService {
    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
       before();
       userService.add();
       after();
    }

    @Override
    public void update() {
        before();
        userService.update();
        after();
    }

    private void before() {     // 在执行方法之前执行
        System.out.println(String.format("log start time [%s] ", new Date()));
    }

    private void after() {      // 在执行方法之后执行
        System.out.println(String.format("log end time [%s] ", new Date()));
    }
}
