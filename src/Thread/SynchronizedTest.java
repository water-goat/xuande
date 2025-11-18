package Thread;

public class SynchronizedTest {

    static int num=0;
    static final Integer N=0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
           for (int i=0;i<10000;i++){
               synchronized (N){
                   num+=1;
               }
           }
        });
        Thread t2=new Thread(()->{
            for (int i=0;i<10000;i++){
                synchronized (N){
                    num++;
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
