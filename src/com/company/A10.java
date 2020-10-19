package com.company;

import java.util.Scanner;

//Monday Tuesday Wednesday Thursday Fridy Saturday Sunday
public class A10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个字母:");
        char letter = input.next().charAt(0);
        switch (letter) {
            case 'M':
                System.out.println("星期一");
                break;
            case 'W':
                System.out.println("星期三");
                break;
            case 'F':
                System.out.println("星期五");
                break;
            case 'T':
                System.out.println("请输入第二个字母");
                char o = input.next().charAt(0);

                if (o == 'u') {
                    System.out.println("星期二");
                } else if (o == 'h') {
                    System.out.println("星期四");

                } else {
                    System.out.println("输入有误  重新输入");
                }
                break;
            case 's':
                System.out.println("请输入你的第二个字母");
                char p = input.next().charAt(0);
                if (p == 'a') {
                    System.out.println("星期六");

                } else if (p == 'u') {
                    System.out.println("星期天");

                } else {
                    System.out.println("输入有误 重新输入");
                }
                break;

        }


    }
}
