package com.alipay.test;

public class Demo {
    public void input(int a, int b) {
        for (int i = a; i <=b; i++) {

            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);

            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("foo");

            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("bar");
            }
            else {
                System.out.println("foobar");
            }
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.input(1,15);

    }



}
