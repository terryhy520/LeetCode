package com.leetcode.no1115.print.foobar.alternately;

import org.junit.Test;

import static org.junit.Assert.*;

public class FooBarTest {

    @Test
    public void foobar01() {
        FooBar fooBar = new FooBar(3);
        Thread fooThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fooBar.foo(new Runnable() {
                        @Override
                        public void run() {
                            System.out.printf("foo");
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread barThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fooBar.bar(new Runnable() {
                        @Override
                        public void run() {
                            System.out.printf("bar");
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        fooThread.start();
        barThread.start();
    }
}