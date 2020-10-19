package com.company;

import java.util.Scanner;

//输入一个月份 ，判断月份属于哪一个季节 ：春天:3,4,5、夏天 ：6，7，8 ，秋天:9,10,11 冬天：12，1，2
public class A3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个月份:");
        int month=input.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("现在是春天!!!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("现在是夏天!!!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("现在是秋天!!!");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("现在是冬天!!!");
                break;
            default:
                System.out.println("你的输入有误!!!");
        }
    }
}
