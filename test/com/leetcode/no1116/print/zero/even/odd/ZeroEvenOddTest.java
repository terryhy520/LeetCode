package com.leetcode.no1116.print.zero.even.odd;

import org.junit.Test;

import java.util.function.IntConsumer;

import static org.junit.Assert.*;

public class ZeroEvenOddTest {

    @Test
    public void test01() {
        IntConsumer intConsumer = new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.print(value);
            }
        };

        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(5);
        Thread threadZero = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    zeroEvenOdd.zero(intConsumer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadOdd = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    zeroEvenOdd.odd(intConsumer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread threadEven = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    zeroEvenOdd.even(intConsumer);
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