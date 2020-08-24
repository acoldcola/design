/**
 * @Author ZhangKe
 * @Date 2020/8/24 15:48
 * @Version 1.0
 */
public abstract class Eat {
    abstract public void breakfast();
    abstract public void lunch();
    abstract public void dinner();

    public void doEat(){
        breakfast();
        lunch();
        dinner();
    }
}
