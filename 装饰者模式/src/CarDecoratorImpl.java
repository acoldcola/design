/**
 * @Author ZhangKe
 * @Date 2020/7/15 18:30
 * @Version 1.0
 */
public class CarDecoratorImpl extends AttachedPropertiesDecorator {
    private String car = "有车";

    public CarDecoratorImpl(Man man) {
        super(man);
    }

    public void addCar() {
        System.out.print(car + " ");
    }

    @Override
    public void getManDesc() {
        super.getManDesc();
        addCar();
    }
}
