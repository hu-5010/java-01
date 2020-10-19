package com.company;

import java.util.Scanner;

//本金10000元存入银行，年利率是千分之三。每过1年，将本金和利息相加作为新的本金。计算5年后，获得的本金是多少？
public class C3 {
    public static void main(String[] args) {
        double  principal=0;//本金
        for(int i=0;i<5;i++){
            Scanner input=new Scanner(System.in);
            System.out.println("请输入你的本金:");
            principal=input.nextDouble();
            principal=principal+(principal*0.003)*5;
            break;
        }
        System.out.println("5年之后一共取出"+(int)principal+"块钱");

    }
}
