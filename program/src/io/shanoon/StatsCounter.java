package io.shanoon;

import java.util.concurrent.atomic.AtomicInteger;

public final class StatsCounter {
//    private volatile int successCount_;

//    private  int successCount_;

    private int successCount_;

    public final int getSuccessCount() {
        return successCount_;
    }
    public final void increaseSuccessCount(int delta) {
         successCount_ += delta;
    }

//    public final synchronized void increaseSuccessCount(int delta) {
//        successCount_ += delta;
//    }
}