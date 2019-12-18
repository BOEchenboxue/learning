package com.alipay.test;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);

        boolean b = atomicInteger.compareAndSet(5, 2019);

        System.out.println(b);
        System.out.println(atomicInteger.get());


    }



}
