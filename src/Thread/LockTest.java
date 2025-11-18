package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    static int num=0;
    static Lock lock=new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            for (int i=0;i<10000;i++){
                lock.lock();
                try {
                    num++;
                }finally {
                    lock.unlock();
                }
            }
        });
        Thread t2=new Thread(()->{
            for (int i=0;i<10000;i++){
                lock.lock();
                try {
                    num++;
                }finally {
                    lock.unlock();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(num);
    }
}
