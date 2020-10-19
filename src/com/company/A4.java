package com.company;

public class A4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        int c = 100;
        if (a > b) {
            a = a;
        } else {
            a = b;
        }
        if (a > c) {
            a = a;
        } else {
            a = c;
        }
        System.out.println("最大值为:" + a);
    }
}
