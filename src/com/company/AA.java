package com.company;

import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int sum1 = input.nextInt();
        int gewei = sum1 % 10;
        int shiwei = sum1 / 10 % 10;
        int baiwei = sum1 / 100 % 10;
        int qianwei = sum1 / 1000;

        int a, b, c, d;//a等于反转后得千位 b等于反转后得百位 c等于反转后得十位 d等于反转后得个位
        a = qianwei;
        b = baiwei;
        c = shiwei;
        d = gewei;


        int sum2 = (d * 1000) + (c * 100) + (b * 10) + a;
        System.out.println("反转后的数为:" + d + c + b + a);

        int sum3 = sum1 + sum2;
        System.out.println("相加的和是" + sum3);


    }
}
