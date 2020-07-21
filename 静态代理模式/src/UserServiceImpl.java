/**
 * @Author ZhangKe
 * @Date 2020/7/20 11:32
 * @Version 1.0
 * 抽象主题接口实现类
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void update() {
        System.out.println("update");
    }
}
