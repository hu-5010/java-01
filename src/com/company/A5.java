package com.company;

import java.util.Scanner;

//提示从键盘输入3个数（其中一个提示使用（+、-、*、/）用来代表加减乘除的符号，其余两个数用来计算），用来分别进行加/减/乘/除的运算
public class A5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("请任意输入2个数字");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("请输入+，-，*，/其中一种关系运算符");
        char c=input.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println(num1+"+"+num2+"="+(num1+num2));
                break;
            case '-':
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                break;
            case '*':
                System.out.println(num1+"*"+num2+"="+(num1*num2));
                break;
            case '/':
                System.out.println(num1+"/"+num2+"="+(num1/num2));
                break;
            default:
                System.out.println("非法运算符");
                break;
        }

    }
}
