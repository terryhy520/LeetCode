package com.leetcode.no1117.building.h2o;

import org.junit.Test;

/**
 * @Author: Terry
 * @Date: 8/23/2021 7:08 PM
 */
public class H2OTest {
    @Test
    public void h2o01() {

        Runnable releaseHydrogen = new Runnable() {
            @Override
            public void run() {
                System.out.printf("H");
            }
        };
        Runnable releaseOxygen = new Runnable() {
            @Override
            public void run() {
                System.out.printf("O");
            }
        };
        H2O h2O = new H2O();
        Thread o = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    h2O.oxygen(releaseOxygen);
                    h2O.oxygen(releaseOxygen);
                    h2O.oxygen(releaseOxygen);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread h = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    h2O.hydrogen(releaseHydrogen);
                    h2O.hydrogen(releaseHydrogen);
                    h2O.hydrogen(releaseHydrogen);
                    h2O.hydrogen(releaseHydrogen);
                    h2O.hydrogen(releaseHydrogen);
                    h2O.hydrogen(releaseHydrogen);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        o.start();
        h.start();
    }

}