package com.company;

import java.util.Scanner;

//输入三个int型的数据，放入到a,b,c三个变量中去，使用条件结构与交换逻辑将这三个变量中的值从小到大排列。
public class A7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三个数字:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println(num1 + "\t" + num2 + "\t" + num3);
        } else if (num1 > num2 && num1 > num3 && num3 > num2) {
            System.out.println(num1 + "\t" + num3 + "\t" + num2);
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.println(num2 + "\t" + num1 + "\t" + num3);
        } else if (num2 > num1 && num2 > num3 && num3 > num1) {
            System.out.println(num2 + "\t" + num3 + "\t" + num1);
        } else if (num3 > num1 && num3 > num2 && num1 > num2) {
            System.out.println(num3 + "\t" + num1 + "\t" + num2);
        } else if (num3 > num1 && num3 > num2 && num2 > num1) {
            System.out.println(num3 + "\t" + num2 + "\t" + num1);
        }


    }
}
