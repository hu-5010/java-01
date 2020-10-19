package com.company;

import java.util.Scanner;

//录入学生的成绩 统计分数大于等于80分的学生比例
public class E2 {
    public static void main(String[] args) {
        int score;//成绩
        int total;//班级人数总和
        int num = 0;//成绩大于80分的人数
        Scanner input=new Scanner(System.in);
        System.out.println("请输入班级的总人数");
        total=input.nextInt();
        for(int i=1;i<=total;i++){
            System.out.println("请输入第"+i+"位学生的成绩");
            score=input.nextInt();
            if(score<80){
                continue;
            }
            num++;
        }
        System.out.println("80分以上的学生的人数是:"+num);
        int rate= (int) ((double)num/total*100);
        System.out.println("80分以上的比例为"+rate+"%");
    }
}
