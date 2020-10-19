package com.company;

//编写JAVA程序，实现输出1-100中的所有不能被7整除的数，并求和。
public class D6 {
    public static void main(String[] args) {
        int num = 0;//和
        for (int i = 1; i <= 100; i++) {
            if (i % 7 != 0) {
                System.out.println("不能被7整数的为:"+i);
                num = num + i;
            }
        }
        System.out.println("不能被7整除的数的和为:" + num);
    }
}
