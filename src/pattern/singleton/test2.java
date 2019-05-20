package pattern.singleton;

import java.util.concurrent.CountDownLatch;

public class test2 {
    public static void main(String[] args) throws InterruptedException {
        long usedTime1A = 0;
        for (int i = 0; i < 1000; i++) {
            usedTime1A += getUsedTime1();
        }
        System.out.println(1.0*usedTime1A/1000);
        long usedTime1B = 0;
        for (int i = 0; i < 1000; i++) {
            usedTime1B += getUsedTime2();
        }
        System.out.println(1.0*usedTime1B/1000);
    }

    public static long getUsedTime2(){
        long startTime = System.currentTimeMillis();

        CountDownLatch countDownLatch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    SingletonDemo2 singletonDemo1 = SingletonDemo2.getInstance();
                }
                countDownLatch.countDown();
            }).start();

        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
//        System.out.println("耗时:"+(endTime-startTime));
        return endTime-startTime;
    }
    public static long getUsedTime1(){
        long startTime = System.currentTimeMillis();

        CountDownLatch countDownLatch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    SingletonDemo1 singletonDemo1 = SingletonDemo1.getInstance();
                }
                countDownLatch.countDown();
            }).start();

        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
//        System.out.println("耗时:"+(endTime-startTime));
        return endTime-startTime;
    }


}
