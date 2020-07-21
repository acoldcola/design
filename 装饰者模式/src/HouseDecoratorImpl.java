/**
 * @Author ZhangKe
 * @Date 2020/7/15 18:31
 * @Version 1.0
 */
public class HouseDecoratorImpl extends AttachedPropertiesDecorator{
    private String house = "有房";

    public HouseDecoratorImpl(Man man) {
        super(man);
    }

    public void addHouse() {
        System.out.print(house + " ");
    }

    @Override
    public void getManDesc() {
        super.getManDesc();
        addHouse();
    }
}
