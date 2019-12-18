package com.alipay.test;

import java.util.concurrent.atomic.AtomicInteger;


class Mydata {
    volatile int number = 0;

    public void addTO60() {
        this.number = 60;
    }

    public void addPlus() {
        number++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();

    public void addAtomic() {
        atomicInteger.getAndIncrement();
    }

}

public class VolatileDemo {
    public static void main(String[] args) {
        Mydata mydata = new Mydata();
        for (int i = 1; i <= 20; i++) {
            new Thread(()->{
                for (int j = 1; j <=1000; j++) {
                    mydata.addPlus();
                    mydata.addAtomic();
                }
            }, String.valueOf(i)).start();
        }

        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"value" +mydata.number);
        System.out.println(Thread.currentThread().getName()+"value" +mydata.atomicInteger);

    }
}
