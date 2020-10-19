package com.company;

import java.util.Scanner;

//输入3个班，每班5个学生的成绩，求每个班的总分、平均分、最高分、最低分
public class F1 {
    public static void main(String[] args) {
        int scoer;//成绩
        int total = 0;//总分
        int avg = 0;//平均分
        int top;//最高分
        int lowest = 999999999;//最低分
        top = scoer = lowest;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++){
            System.out.println("第" + i + "个班级");
        for (int j = 1; j <= 5; j++) {
            System.out.println("请输入第" + j + "个学生的成绩");
            scoer = input.nextInt();
            total += scoer;
            avg = (int) ((double)total / 5);
            if (scoer > top) {
                top = scoer;

            }
            if (scoer < lowest) {
                lowest = scoer;
            }

        }
        System.out.println("第" + i + "个班级的总分是" + total);
        System.out.println("第" + i + "个班级的平均分是" + avg);
        System.out.println("第" + i + "个班级的最高分分是" + top);
        System.out.println("第" + i + "个班级的最低分分是" + lowest);


    }


}}

