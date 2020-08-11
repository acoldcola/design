/**
 * @Author ZhangKe
 * @Date 2020/8/10 16:34
 * @Version 1.0
 * 使用策略类
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.doSomeing();
    }
}
