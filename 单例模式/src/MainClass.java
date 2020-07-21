/**
 * @Author ZhangKe
 * @Date 2020/7/21 14:18
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
        new Thread(() -> System.out.println(Singleton.getSingleton())).start();
    }
}
