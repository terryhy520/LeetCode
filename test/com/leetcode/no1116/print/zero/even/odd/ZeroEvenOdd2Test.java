package com.leetcode.no1116.print.zero.even.odd;

import org.junit.Test;

import java.util.function.IntConsumer;

import static org.junit.Assert.*;

public class ZeroEvenOdd2Test {

    @Test
    public void test01() {
        IntConsumer intConsumer = new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.print(value);
            }
        };

        ZeroEvenOdd2 zeroEvenOdd2 = new ZeroEvenOdd2(9);

        Thread threadZero = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    zeroEvenOdd2.zero(intConsumer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadEven = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    zeroEvenOdd2.even(intConsumer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadOdd = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    zeroEvenOdd2.odd(intConsumer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadZero.start();
        threadEven.start();
        threadOdd.start();
    }
}