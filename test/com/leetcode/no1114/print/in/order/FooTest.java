package com.leetcode.no1114.print.in.order;

import org.junit.Test;

public class FooTest {

    @Test
    public void first01() {
        Runnable first = new Runnable() {
            @Override
            public void run() {
                System.out.println("first");
            }
        };

        Runnable second = new Runnable() {
            @Override
            public void run() {
                System.out.println("second");
            }
        };

        Runnable third = new Runnable() {
            @Override
            public void run() {
                System.out.println("third");
            }
        };
        Foo foo = new Foo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    foo.first(first);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    foo.second(second);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    foo.third(third);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread3.start();
        thread2.start();
        thread1.start();
    }
}