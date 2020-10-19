package com.company;

import java.util.Scanner;

//从键盘上接收一批整数，比较并输出其中的最大值和最小值，输入数字0时结束循环 
public class C6 {
    public static void main(String[] args) {
        int num;
        int max=0;
        int min=999999999;
        Scanner input = new Scanner(System.in);
        System.out.println("接受一批整数(输入0结束):");
        while ((num=input.nextInt())!=0){
            if(num>max){
                max=num;
            }if(num<min){
                min=num;
            }

        }
        System.out.println("最大值为:"+max);
        System.out.println("最小值为:"+min);
    }
}
