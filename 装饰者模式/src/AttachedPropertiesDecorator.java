/**
 * @Author ZhangKe
 * @Date 2020/7/15 18:28
 * @Version 1.0
 * 抽象装饰者角色
 */
public class AttachedPropertiesDecorator implements Man{
    private Man man;

    public AttachedPropertiesDecorator(Man man) {
        this.man = man;
    }

    @Override
    public void getManDesc() {
        man.getManDesc();
    }
}
