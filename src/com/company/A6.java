package com.company;

import java.util.Scanner;

//要求用户输入一个整数，判断该数是奇数还是偶数。
public class A6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int integer = input.nextInt();
        if (integer / 2 != 0) {
            System.out.println("你输入的是奇数");
        } else {
            System.out.println("你输入的是偶数");
        }
    }
}