package com.company;

import java.util.Scanner;

//假如你准备去海南旅游，现在要在网上订购机票。机票的价格受季节影响、而且头等舱、商务舱、经济舱价格也不同。
//假设机票原价为5000元，4~10月为旺季，旺季头等舱9折，商务舱8折、经济舱7折，其也月份为淡季，淡季头等舱5折，商务舱4折、经济舱3折。
public class A2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double actual;//实价
        System.out.println("请输入你的机票的价格:");
        double ticket = input.nextDouble();
        System.out.println("请输入你的舱位");
        String sex = input.next();
        System.out.println("请输入月份:");
        int month = input.nextInt();
        if (month > 0 && month < 13) {
            if (month >= 4 && month <= 10) {
                if (sex.equals("头等舱")) {
                    actual = ticket * 0.9;
                    System.out.println("你的实际票价为:" + actual);

                } else if (sex.equals("商务舱")) {
                    actual = ticket * 0.8;
                    System.out.println("你的实际票价为:" + actual);

                } else if (sex.equals("经济舱")) {
                    actual = ticket * 0.7;
                    System.out.println("你的实际票价为:" + actual);
                }


            } else if (month >= 1 && month <= 12) {
                if (sex.equals("头等舱")) {
                    actual = ticket * 0.5;
                    System.out.println("你的实际票价为:" + actual);

                } else if (sex.equals("商务舱")) {
                    actual = ticket * 0.4;
                    System.out.println("你的实际票价为:" + actual);

                } else if (sex.equals("经济舱")) {
                    actual = ticket * 0.3;
                    System.out.println("你的实际票价为:" + actual);
                }


            }
        } else {
            System.out.println("你的输入有误");
        }
    }
}

