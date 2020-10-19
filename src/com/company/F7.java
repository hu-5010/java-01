package com.company;

import java.util.Scanner;

public class F7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入整型会员号");
        int num = input.nextInt();
        int i = 0;
        while (num != 0) {
            num = num / 10;
        }
        if (i != 4) {
            System.out.println("您输入的会员号有误");
        } else {
            System.out.println("登录成功!");
        }
    }
}
