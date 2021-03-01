import com.oracle.jrockit.jfr.Producer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author ZhangKe
 * @Date 2021/3/1 16:07
 * @Version 1.0
 * 通过ReenteantLock实现生产者消费者模式
 */
public class ProducerConsumerByReentrantLock {
    private static final Integer size = 10;
    private static final Lock lock = new ReentrantLock();
    private static final Condition fullCondition = lock.newCondition();
    private static final Condition emptyCondition = lock.newCondition();


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Thread pro1 = new Thread(new Producer(queue,"生产者1",10));
        Thread pro2 = new Thread(new Producer(queue,"生产者2",10));
        Thread con1 = new Thread(new Consumer(queue,"消费者1",10));
        Thread con2 = new Thread(new Consumer(queue,"消费者2",10));
        Thread con3 = new Thread(new Consumer(queue,"消费者3",10));
        pro1.start();
        pro2.start();
        con1.start();
        con2.start();
        con3.start();
    }


    public static class Producer implements Runnable {
        private Queue<Integer> queue;
        private String name;
        private Integer maxSize;
        private Integer integer = 0;

        Producer(Queue<Integer> queue, String name, Integer maxSize) {
            this.queue = queue;
            this.name = name;
            this.maxSize = maxSize;
        }

        @Override
        public void run() {
            while (true) {
                lock.lock();
                try {
                    while (queue.size() == maxSize) {
                        try {
                            System.out.println("队列已经满了[" + name + "]线程等待 " + "消费者从队列消费.");
                            //条件不满足，生产阻塞
                            fullCondition.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("[" + name + "] 生产了值 : +" + integer);
                    queue.offer(integer++);
                    fullCondition.signalAll();
                    emptyCondition.signalAll();
                } finally {
                    lock.unlock();
                    try {
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static class Consumer implements Runnable{
        private Queue<Integer> queue;
        private String name;

        public Consumer(Queue<Integer> queue, String name, Integer maxSize) {
            this.queue = queue;
            this.name = name;
        }
        @Override
        public void run() {
            while (true) {
                lock.lock();
                try {
                    while(queue.isEmpty()){
                        try {
                            System.out.println("队列是空的, 消费者[" + name + "] 线程等待生产者生成数据");
                            emptyCondition.await();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    int x = queue.poll();
                    System.out.println("[" + name + "] 消费了值 : " + x);

                    fullCondition.signalAll();
                    emptyCondition.signalAll();
                } finally {
                    lock.unlock();
                    try {
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
