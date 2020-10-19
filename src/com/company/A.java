package com.company;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;
import java.util.concurrent.Callable;

//6)、银行利率表如下表所示，请计算存款10000元，活期1年、活期2年，定期1年，定期2年后的本息合计。

// 结果如下图所示。（结果四舍五入，不保留小数位。使用Math.round(double d)实现）

public class A {
    public static void main(String[] args) {
        int card;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入您的4位卡号:");
        card = input.nextInt();
        int gewei = card % 10;
        int shiwei = card / 10 % 10;
        int baiwei = card / 100 % 10;
        int qianwei = card / 1000;

        int sum = gewei + shiwei + baiwei + qianwei;
        System.out.println("会员卡号:" + card + "卡号之和:" + sum);
        boolean luck = sum > 20;
        System.out.println("您是幸运用户吗???" + luck);


    }

}
























