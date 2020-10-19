package com.company;
//要求用户输入一个0到2之间的整数， * 如果用户输入0输出“你出的是石头”，
//        * 如果用户输入1就输出“你出的是剪刀”， * 如果用户输入的是2就输出“你出的是布”， * 然后再问是否要继续出拳，
//        * 如果回答“y”就重复以上过程，否则结束程序。

import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {
        String boxing = null;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入数字");
            int sum = input.nextInt();
            if (sum == 0) {
                System.out.println("你出的是石头");
            } else if (sum == 1) {
                System.out.println("你出的是剪刀");
            } else if (sum == 2) {
                System.out.println("你出的是布");

            }
            System.out.println("s是否继续出拳(y/n)");
            boxing = input.next();
        } while (boxing.equals("y"));
        {
            System.out.println("程序结束");
        }
    }
}

