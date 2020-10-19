package com.company;
//输入小明成绩，显示所获奖励,成绩==100分，想干啥就啥,

import java.util.Scanner;//成绩>=90,看电视、吃零食,90>成绩>=60，看书，写作业，成绩<60，做家务、洗碗、拖地。
public class A9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入小明的成绩:");
        int grade=input.nextInt();
        if(grade==100){
            System.out.println("想干嘛干嘛!");

        }else if(grade<100&&grade>=90){
            System.out.println("看电视 吃零食!");

        }else if(grade<90&&grade>=60){
            System.out.println("看书  写作业!");

        }else if(grade<60){
            System.out.println("做家务 洗碗 拖地!");

        }
    }
}
