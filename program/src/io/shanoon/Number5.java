package io.shanoon;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Number5 implements Runnable {

    private int n_;
    CyclicBarrier barrier_;
    CountDownLatch count_;

    public Number5(int n, CountDownLatch count, CyclicBarrier barrier) {
        this.n_ = n;
        this.count_ = count;
        this.barrier_ = barrier;

    }

    @Override
    public void run() {
        try{

            Thread.sleep(n_ * 1000);
            barrier_.await();
            System.out.println(" Thread " +  n_ + " Running");
        }
        catch (InterruptedException | BrokenBarrierException e){

        }
        finally {
            count_.countDown();

        }
    }
}
