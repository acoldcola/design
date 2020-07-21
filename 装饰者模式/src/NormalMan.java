/**
 * @Author ZhangKe
 * @Date 2020/7/15 18:26
 * @Version 1.0
 * 具体构建角色
 */
public class NormalMan implements Man {
    private String name;

    public NormalMan(String name) {
        this.name = name;
    }

    @Override
    public void getManDesc() {
        System.out.print(name + ": ");
    }
}
