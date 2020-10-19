package com.company;

import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入两个数字:");
        double a=input.nextDouble();
        double b=input.nextDouble();
        if(a>10&&b<20){
            System.out.println(a+"+"+b+"="+(int)(a+b));
        }else{
            System.out.println(a+"*"+b+"="+(int)(a*b));
        }

        }
    }
