import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author ZhangKe
 * @Date 2020/7/21 14:12
 * @Version 1.0
 */
public class Singleton {
    private volatile static Singleton singleton = null;
    private Singleton(){

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
