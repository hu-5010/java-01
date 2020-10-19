package com.company;

import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入岳小鹏的期末考试成绩:");
        int grade = input.nextInt();
        if (grade < 0) {
            System.out.println("你输入的年龄有误");
        } else if (grade ==100) {
            System.out.println("奖励一辆BWM");
        } else if (grade <99&&grade>=80) {
            System.out.println("奖励IPhone12一部");
        } else if (grade <80&&grade>60) {
            System.out.println("奖励ipad一部");
        } else {
            System.out.println("什么奖励都没有!!!");
        }
    }
}
