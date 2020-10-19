package com.company;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        int i,j;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int s=input.nextInt();
        System.out.println("这个数的加法表");
        for (i=0,j=s;i<s;i++,j--){
            System.out.println(i+"+"+j+"="+(i+j));

        }
    }
}
