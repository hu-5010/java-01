package com.company;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        int score;
        int sum = 0;
        int avg;
        boolean i = false;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生的姓名:");
        String name = input.next();
        for (int a = 1; a <= 5; a++) {
            System.out.println("请输入第" + a + "门课的成绩");
            score = input.nextInt();
            if (score < 0) {
                i = true;
                break;
            }
            sum = score + sum;
        }
        if (i) {
            System.out.println("抱歉,你输入的分数有误  请重新输入:");
        } else {
            avg = sum / 5;
            System.out.println(name + "的平均分为" + avg);


        }
    }
}
