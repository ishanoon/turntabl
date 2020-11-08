package io.shanoon;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Synchronize  {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {
            public void run() {
                System.out.println("Barrier Reached");
            }
        });
            CountDownLatch down = new CountDownLatch(5);

        Thread t1 = new Thread(new Number5(1, down, barrier));
        Thread t2 = new Thread(new Number5(2, down, barrier));
        Thread t3 = new Thread(new Number5(3,down, barrier));
        Thread t4 = new Thread(new Number5(4,down, barrier));
        Thread t5 = new Thread(new Number5(5,down, barrier));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

//        System.out.println("All done!!!");

        try{

            down.await();
            System.out.println("After threading");
        } catch (InterruptedException e) {

        }
        finally {
            down.await();
        }
    }
}
