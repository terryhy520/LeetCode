package com.leetcode.no1117.building.h2o;

/**
 * @Author: Terry
 * @Date: 8/23/2021 7:07 PM
 */

import java.util.concurrent.Semaphore;

class H2O {

    private Semaphore h = new Semaphore(2);
    private Semaphore o = new Semaphore(0);

    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        h.acquire(1);
        releaseHydrogen.run();
        o.release(1);

        // releaseHydrogen.run() outputs "H". Do not change or remove this line.

    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        o.acquire(2);
        releaseOxygen.run();
        h.release(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
    }
}