package com.alipay.test;

public class GCTest {
    public static void main(String[] args) {

        System.out.println("ClassLodarDemo's ClassLoader is " + GCTest.class.getClassLoader());
        System.out.println("The Parent of ClassLodarDemo's ClassLoader is " + GCTest.class.getClassLoader().getParent());
        System.out.println("The GrandParent of ClassLodarDemo's ClassLoader is " + GCTest.class.getClassLoader().getParent().getParent());
    }

}
